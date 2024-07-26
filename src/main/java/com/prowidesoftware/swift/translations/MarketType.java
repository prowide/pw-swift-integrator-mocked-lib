package com.prowidesoftware.swift.translations;

public enum MarketType {
    ISO_20022("ISO 20022"),
    CBPR("CBPR+"),
    SIC("SIC"),
    RITS("RITS"),
    CHATS("CHATS"),
    SCRIPS("SCRIPS"),
    T2("T2"),
    LYNX("LYNX"),
    SWIFTGO("SWIFTGO");

    private String name;

    private MarketType(String value) {
        this.name = value;
    }

    public final String getName() {
        return this.name;
    }
}
