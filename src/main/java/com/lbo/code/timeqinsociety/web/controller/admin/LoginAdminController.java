package com.lbo.code.timeqinsociety.web.controller.admin;

import com.lbo.code.timeqinsociety.common.cache.RedisCache;
import com.lbo.code.timeqinsociety.common.utils.StringUtil;
import com.lbo.code.timeqinsociety.domain.UserInfo;
import com.lbo.code.timeqinsociety.service.LoginService;
import com.lbo.code.timeqinsociety.service.UserService;
import com.lbo.code.timeqinsociety.web.RestException;
import com.lbo.code.timeqinsociety.web.dto.req.LoginAdminReqDto;
import com.lbo.code.timeqinsociety.web.dto.rsp.LoginAdminRspDto;
import com.lbo.code.timeqinsociety.web.dto.rsp.base.ErrorCode;
import com.lbo.code.timeqinsociety.web.dto.rsp.base.VoidRspDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping(value = "/admin")
public class LoginAdminController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public LoginAdminRspDto login(@Valid @RequestBody LoginAdminReqDto reqDto) {
        UserInfo userInfo = loginService.checkTeacherUsername(reqDto.getUsername());
        if (null == userInfo) {
            throw new RestException(ErrorCode.USERNAME_NOT_EXIST);
        }
        if (!StringUtil.getMd5(reqDto.getPassword().getBytes()).equals(userInfo.getPassword())) {
            throw new RestException(ErrorCode.PASSWORD_ERROR);
        }
        userInfo.setLastLoginTime(new Date());
        userService.update(userInfo);

        String token = UUID.randomUUID().toString();
        RedisCache.addToken(token, userInfo);

        return LoginAdminRspDto.builder().id(userInfo.getId())
                .name(userInfo.getName()).headUrl(userInfo.getHeadUrl())
                .token(token).build();
    }

    @GetMapping("logout")
    public VoidRspDto logout(@Valid @RequestParam("token") String token) {
        RedisCache.deleteToken(token);
        return new VoidRspDto();
    }

}
