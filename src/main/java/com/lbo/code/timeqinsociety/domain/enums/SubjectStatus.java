package com.lbo.code.timeqinsociety.domain.enums;

public enum SubjectStatus {

    NOT_START("未开始"),
    AGOING("进行中"),
    CANCEL("已取消"),
    OVER("已结束");

    private final String description;

    SubjectStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
