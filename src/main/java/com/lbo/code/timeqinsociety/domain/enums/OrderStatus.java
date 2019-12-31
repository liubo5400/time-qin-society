package com.lbo.code.timeqinsociety.domain.enums;

public enum OrderStatus {

    NOT_PAY("未支付"),
    AGOING("进行中"),
    PAUSE("暂停中"),
    OVER("已结束"),
    BACK("已退款");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
