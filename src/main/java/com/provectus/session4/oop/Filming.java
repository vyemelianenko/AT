package com.provectus.session4.oop;

public interface Filming {
    public void takePhoto();

    void makeClip();

    default String showCameraInfo() {
        return "Camera info";
    }


}
