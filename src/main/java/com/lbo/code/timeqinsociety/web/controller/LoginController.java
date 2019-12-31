package com.lbo.code.timeqinsociety.web.controller;

import com.lbo.code.timeqinsociety.service.LoginService;
import com.lbo.code.timeqinsociety.web.dto.req.LoginReqDto;
import com.lbo.code.timeqinsociety.web.dto.rsp.LoginRspDto;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping(value = "/web")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public LoginRspDto login(@Valid @RequestBody LoginReqDto reqDto) {
        if (StringUtils.isBlank(reqDto.getOId())) {
            if (StringUtils.isBlank(reqDto.getUsername()) || StringUtils.isBlank(reqDto.getPassword())) {

            }
        }
        return new LoginRspDto();
    }
}
