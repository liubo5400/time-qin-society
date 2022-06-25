package com.lbo.code.timeqinsociety.domain.enums;

public enum Status {

    ENABLED("可用"),
    DISABLED("已停用"),
    DELETE("已删除");

    private final String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
