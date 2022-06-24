package com.provectus.session4.oop;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class AndroidPhone extends Phone {
    @Override
    public void makeCall(String number) {
        System.out.println("Calling from Android to " + number);
    }

    @Override
    public void sendSms(String number, String text) {
        System.out.println("Sending text " + text + " to number " + number + " from Android");
    }
}
