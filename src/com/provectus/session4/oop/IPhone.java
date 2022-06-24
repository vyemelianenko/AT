package com.provectus.session4.oop;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class IPhone extends Phone implements Filming, Audible {
    @Override
    public void makeCall(String number) {
        System.out.println("Calling from IPhone to " + number);
    }

    @Override
    public void sendSms(String number, String text) {
        System.out.println("Sending text " + text + " to number " + number + " from IPhone");
    }

    @Override
    public void takePhoto() {
        System.out.println("Making photo from Iphone");
    }

    @Override
    public void makeClip() {
        System.out.println("Making clip from Iphone");
    }

    @Override
    public void playTrack(String track) {
        System.out.println("Playing track from Iphone");
    }

    @Override
    public void playPodcast() {
        System.out.println("Playing podcast " + "from Iphone");
    }
}
