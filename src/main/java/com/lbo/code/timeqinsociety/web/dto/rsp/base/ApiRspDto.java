package com.lbo.code.timeqinsociety.web.dto.rsp.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiRspDto {

    private Integer returnCode;

    private String returnMsg;

    private Object response;

    public ApiRspDto() {
        this.returnCode = 0;
        this.returnMsg = "success";
        this.response = null;
    }

    public ApiRspDto(Object responseParams) {
        this.returnCode = 0;
        this.returnMsg = "success";
        this.response = responseParams;
    }
}
