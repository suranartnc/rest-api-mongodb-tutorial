package com.example.restapimongodbtutorial.model.enumeration;

public enum MerchantType {

    QR("Scan & Pay"), MERCHANDISE("X Store");

    public final String key;
    MerchantType(String key) {
        this.key = key;
    }
}