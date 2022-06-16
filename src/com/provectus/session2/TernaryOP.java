package com.provectus.session2;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class TernaryOP {
    public static void main(String[] args) {

        int dayOfWeek = 4;
        String day;

//        if (dayOfWeek >= 5) {
//            day = "holiday";
//        } else {
//            day = "working day";
//        }

//тернальний опереатор

        day = dayOfWeek > 5 ? "holiday" : "working day";


        System.out.println(day);
    }

}
