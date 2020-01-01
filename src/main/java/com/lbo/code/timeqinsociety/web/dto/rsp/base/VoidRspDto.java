package com.lbo.code.timeqinsociety.web.dto.rsp.base;

import lombok.Data;

@Data
public class VoidRspDto {

    private String result;

    public VoidRspDto() {
        this.result = "success";
    }
}
