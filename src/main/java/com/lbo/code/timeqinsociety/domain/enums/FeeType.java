package com.lbo.code.timeqinsociety.domain.enums;

public enum FeeType {

    INNER("收入"),
    OUTER("支出");

    private final String description;

    FeeType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
