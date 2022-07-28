package com.provectus.session4.oop;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class PhoneEx {
    public static void main(String[] args) {
//        IPhone iPhone = new IPhone();
//        Phone iPhone = new IPhone();
//        iPhone.sendSms("1234", "text");
//        iPhone.makeCall("3344");
//        iPhone.playPodcast();
//
//        AndroidPhone androidPhone = new AndroidPhone();
//        androidPhone.getVersion();
//        androidPhone.makeCall("7788");
//        androidPhone.sendSms("778849", "texty");


        Phone phone = new IPhone();
        phone.makeCall("777888");

        phone = new AndroidPhone();
        phone.makeCall("999888");

        Audible audible = new IPod();
        audible.playTrack("queen");

        audible = new IPhone();
        audible.playTrack("new IPhone track");
    }

}
