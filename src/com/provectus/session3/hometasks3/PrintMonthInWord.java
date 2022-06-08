package com.provectus.session3.hometasks3;
import java.util.Scanner;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class PrintMonthInWord {

    public static void main(String[] args) {

        System.out.println("Enter a month");

        Scanner sc = new Scanner(System.in);
        int inputMonth = sc.nextInt();

        //If else variant
        if (inputMonth == 1) {
            System.out.println("JAN");
        } else if (inputMonth == 2) {
            System.out.println("FEB");
        } else if (inputMonth == 3) {
            System.out.println("MAR");
        } else if (inputMonth == 4) {
            System.out.println("APR");
        } else if (inputMonth == 5) {
            System.out.println("MAY");
        } else if (inputMonth == 6) {
            System.out.println("JUN");
        } else if (inputMonth == 7) {
            System.out.println("JUL");
        } else if (inputMonth == 8) {
            System.out.println("AUG");
        } else if (inputMonth == 9) {
            System.out.println("SEP");
        } else if (inputMonth == 10) {
            System.out.println("OCT");
        } else if (inputMonth == 11) {
            System.out.println("NOV");
        } else if (inputMonth == 12) {
            System.out.println("DEC");
        } else {
            System.out.println("Not a valid month");
        }

//        //Swtich variant > could you please uncomment me
//        switch (inputMonth) {
//            case 1:
//                System.out.println("JAN");
//                break;
//
//            case 2:
//                System.out.println("FEB");
//                break;
//
//            case 3:
//                System.out.println("MAR");
//                break;
//
//            case 4:
//                System.out.println("APR");
//                break;
//
//            case 5:
//                System.out.println("MAY");
//                break;
//
//            case 6:
//                System.out.println("JUN");
//                break;
//
//            case 7:
//                System.out.println("JUL");
//                break;
//
//            case 8:
//                System.out.println("AUG");
//                break;
//
//            case 9:
//                System.out.println("SEP");
//                break;
//
//            case 10:
//                System.out.println("OCT");
//                break;
//
//            case 11:
//                System.out.println("NOV");
//                break;
//
//            case 12:
//                System.out.println("DEC");
//                break;
//
//            default:
//                System.out.println("Not a valid month");
//
//        }
    }
}
