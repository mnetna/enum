package com.test;


import java.util.Arrays;
import java.util.List;

public enum PayGroup {
    CASH("현금", Arrays.asList(PayType.ACCOUNT_TRANSFER, PayType.REMITTANCE)),
    CARD("카드", Arrays.asList(PayType.PAYCO, PayType.CARD));

    private String title;
    private List<PayType> payList;

    PayGroup(String title, List<PayType> payList) {
        this.title = title;
        this.payList = payList;
    }

    public static PayGroup findByPayCode(PayType payType) {
        return Arrays.stream(PayGroup.values())
                .filter(x -> x.hasPayCode(payType))
                .findAny()
                .get();
    }

    public boolean hasPayCode(PayType payType) {
        return payList.stream()
                .anyMatch(pay -> pay == payType);
    }

    public String getTitle() { return title; }
}
