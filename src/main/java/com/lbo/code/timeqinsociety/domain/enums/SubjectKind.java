package com.lbo.code.timeqinsociety.domain.enums;

public enum SubjectKind {

    SINGLE("一对一"),
    TERM("小组课");

    private final String description;

    SubjectKind(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
