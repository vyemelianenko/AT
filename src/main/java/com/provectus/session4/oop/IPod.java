package com.provectus.session4.oop;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class IPod implements Audible, Filming {
    @Override
    public void playTrack(String track) {
        System.out.println("PLaying track from IPod " + track);
    }

    @Override
    public void playPodcast() {
        System.out.println("Playing podcast " + "on Ipod");
    }

    @Override
    public void takePhoto() {
        System.out.println("Making photo from Ipod");
    }

    @Override
    public void makeClip() {
        System.out.println("Making clip from Ipod");
    }
}
