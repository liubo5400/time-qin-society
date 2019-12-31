package com.lbo.code.timeqinsociety.web.dto.rsp.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Value;

@Value
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorRspDto extends ApiRspDto {

    private int errorCode;

    private String errorMsg;

    public ErrorRspDto() {
        super(null);
        this.errorCode = ErrorCode.SYSTEM_ERROR.getCode();
        this.errorMsg = ErrorCode.SYSTEM_ERROR.getMsg();
    }

    public ErrorRspDto(ErrorCode rspCode) {
        super(null);
        this.errorCode = rspCode.getCode();
        this.errorMsg = rspCode.getMsg();
    }

    public ErrorRspDto(int errorCode, String errorMsg) {
        super(null);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

}
