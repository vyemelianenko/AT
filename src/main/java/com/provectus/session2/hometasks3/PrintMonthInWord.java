package com.provectus.session2.hometasks3;

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

    }
}
