package com.lbo.code.timeqinsociety.domain.enums;

public enum FeeKind {

    RCCM("日常采买"),
    ZCCM("资产采买"),
    JSGZ("教师工资"),
    KSF("课时费"),
    JFCM("教辅采买"),
    QCCM("器材采买"),
    ;

    private final String description;

    FeeKind(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
