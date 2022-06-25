package com.lbo.code.timeqinsociety.web.controller.admin;

import cn.dev33.satoken.stp.StpUtil;
import com.lbo.code.timeqinsociety.common.utils.StringUtil;
import com.lbo.code.timeqinsociety.domain.SysUser;
import com.lbo.code.timeqinsociety.service.LoginService;
import com.lbo.code.timeqinsociety.service.SysUserService;
import com.lbo.code.timeqinsociety.web.RestException;
import com.lbo.code.timeqinsociety.web.dto.req.LoginAdminReqDto;
import com.lbo.code.timeqinsociety.web.dto.rsp.LoginAdminRspDto;
import com.lbo.code.timeqinsociety.web.dto.rsp.base.ErrorCode;
import com.lbo.code.timeqinsociety.web.dto.rsp.base.VoidRspDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.UUID;

/**
 * 登陆相关
 */
@Slf4j
@Api(tags = "登录认证相关")
@RestController
@RequestMapping(value = "/admin")
public class LoginAdminController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private SysUserService sysUserService;

    @ApiOperation(value = "登录", notes = "")
    @PostMapping("/login")
    public LoginAdminRspDto login(@Valid @RequestBody LoginAdminReqDto reqDto) {
        SysUser sysUser = loginService.checkTeacherUsername(reqDto.getUsername());
        if (null == sysUser) {
            throw new RestException(ErrorCode.USERNAME_NOT_EXIST);
        }
        if (!StringUtil.getMd5(reqDto.getPassword().getBytes()).equals(sysUser.getPassword())) {
            throw new RestException(ErrorCode.PASSWORD_ERROR);
        }
        StpUtil.login(sysUser.getId());

        sysUser.setLastLoginTime(new Date());
        sysUserService.update(sysUser);

        return LoginAdminRspDto.builder().id(sysUser.getId())
                .name(sysUser.getName()).headUrl(sysUser.getHeadUrl())
                .token(StpUtil.getTokenValue()).build();
    }

    @ApiOperation(value = "退出", notes = "")
    @GetMapping("logout")
    public VoidRspDto logout() {
        StpUtil.logout();
        return new VoidRspDto();
    }

}
