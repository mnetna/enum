package com.test;

public enum PayType {

    ACCOUNT_TRANSFER("계좌이체"),
    REMITTANCE("무통장입금"),
    PAYCO("페이코"),
    CARD("카드");

    private String title;

    PayType(String title) { this.title = title; }

    public String getTitle() { return title; }
}
