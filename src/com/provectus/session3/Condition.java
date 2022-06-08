package com.provectus.session3;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class Condition {
    public static void main(String[] args) {

        int cond = 0;
//        if (cond > 0) {
//            System.out.println("INSIDE IF");
//        } else {
//            System.out.println("inside else");
//        }

        if (cond >=0) {
            System.out.println("INSIDE IF1");
            if (cond >0) {
                System.out.println("INSIDE IF2");
            } else {
                System.out.println("INSIDE ELSE 2");
            }
        } else {
            System.out.println("INSIDE ELSE1");
        }


        System.out.println("AFTER IF");
    }

}
