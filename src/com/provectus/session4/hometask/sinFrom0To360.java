package com.provectus.session4.hometask;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class sinFrom0To360 {
    public static void main(String[] args) {
        for (int i = 0; i < 361 ; i=i+10) {
            System.out.println(Math.toRadians(i));
            System.out.println(i);
        }
    }

}
