package com.lbo.code.timeqinsociety.web.dto.rsp.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public enum ErrorCode {

    /*************************** 公共错误码 1XXXX *******************************************/

    SYSTEM_ERROR(10001,"系统异常"),

    ERROR_METHOD(10002, "错误的请求方式（GET/POST/PUT/DELETE）"),

    PARAMS_LOST(10003, "请求参数缺失"),

    PARAMS_NOT_VALID(10004, "存在不合法的请求参数"),

    RESOURCE_NOT_EXIST(10005, "资源不存在"),

    DATA_OUT_OF_THRESHOLD(10006, "数据超过阈值"),

    FREQUENT_OPERATION(10007, "操作频繁"),

    REPEAT_OPERATION(10008, "重复操作"),

    ILLEGAL_REQUEST(10009, "非法请求"),

    DATA_HAS_EXISTS(10010, "数据已存在"),

    PERMISSION_DENIED(10011, "权限不足"),

    /*************************** 业务错误码 2XXXX *******************************************/

    USERNAME_NOT_EXIST(20001,"账号不存在"),

    PASSWORD_ERROR(20002,"账号或密码不正确"),



    ;


    private Integer code;

    private String msg;

    ErrorCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
