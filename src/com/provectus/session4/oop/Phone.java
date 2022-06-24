package com.provectus.session4.oop;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public abstract class Phone {
    public abstract void makeCall(String number);

    public abstract void sendSms(String number, String text);

    public String getVersion() {
        return "";
    }
}
