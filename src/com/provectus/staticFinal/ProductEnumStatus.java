package com.provectus.staticFinal;

public enum ProductEnumStatus {
    NEW("New"),
    ACTIVE("active"),
    INACTIVE("inactive"),
    OUTOFSALE("out of sale"),
    DISCOUNT("iscount");

    private String value;
    ProductEnumStatus(String value) {
        this.value = value;
    }

    public String getValue (){
        return value;
    }
}
