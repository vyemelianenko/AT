package com.provectus.session5;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class Construct {

    protected String value;
//    public Construct() {
//        System.out.println("Creating enw Construct object");
//    }

    public Construct(String value) {
        System.out.println("create Construct");
        this.value = value;
    }


    public String getValue() {
        return this.value;
    }
}
