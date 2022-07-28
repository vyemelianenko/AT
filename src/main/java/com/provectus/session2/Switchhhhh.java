package com.provectus.session2;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class Switchhhhh {
    public static void main(String[] args) {
        String dayOfWeek = "TUE";

        switch (dayOfWeek) {
            case "MON":
                System.out.println("It is Monday");
                break;

            case "TUE":
                System.out.println("IT Is TUesday");
//                break;

            case "WED":
                System.out.println("It is Wennesday ");
                break;

            case "FRD":
                System.out.println("OHHHHHHH it is Friday");
                break;

            case "SUN":
            case "SAT":
                System.out.println("Holiday");

            default:
                System.out.println("Wrong day");
        }
        System.out.println("AFETR SWITCH");
    }
}
