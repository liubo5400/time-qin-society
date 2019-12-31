package com.lbo.code.timeqinsociety.web;

import com.lbo.code.timeqinsociety.web.dto.rsp.base.ErrorCode;
import lombok.Value;

@Value
public class RestException extends RuntimeException {

    private int errorCode;
    private String errorMsg;

    public RestException() {
        this.errorCode = ErrorCode.SYSTEM_ERROR.getCode();
        this.errorMsg = ErrorCode.SYSTEM_ERROR.getMsg();
    }

    public RestException(ErrorCode rspCode) {
        this.errorCode = rspCode.getCode();
        this.errorMsg = rspCode.getMsg();
    }

}
