package com.provectus.session3.hometasks;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class sinFrom0To360 {
    public static void main(String[] args) {
        for (int i = 0; i <= 360 ; i=i+10) {
            System.out.println(Math.toRadians(i));
            System.out.println(i);
        }
    }

}
