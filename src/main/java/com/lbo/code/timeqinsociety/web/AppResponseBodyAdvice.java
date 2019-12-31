package com.lbo.code.timeqinsociety.web;

import com.lbo.code.timeqinsociety.web.dto.rsp.base.ApiRspDto;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice(value = "com.lbo.code.timeqinsociety")
public class AppResponseBodyAdvice implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return true;
    }

    @Override
    public ApiRspDto beforeBodyWrite(Object dto, MethodParameter methodParameter, MediaType mediaType,
                                     Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest,
                                     ServerHttpResponse serverHttpResponse) {
        HttpServletRequest request = ((ServletServerHttpRequest) serverHttpRequest).getServletRequest();

        ApiRspDto rspDto = null;
        if (dto instanceof ApiRspDto) {
            rspDto = (ApiRspDto) dto;
        } else {
            rspDto = new ApiRspDto(dto);
        }
        return rspDto;
    }
}