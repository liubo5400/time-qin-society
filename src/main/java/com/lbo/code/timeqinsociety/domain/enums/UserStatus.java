package com.lbo.code.timeqinsociety.domain.enums;

public enum UserStatus {

    ENABLED("可用"),
    DISABLED("已停用"),
    DELETE("已删除");

    private final String description;

    UserStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
