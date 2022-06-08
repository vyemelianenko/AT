package com.provectus.session3.hometasks3;
import java.util.Scanner;


/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class CheckOddEven {
    public static void main(String[] args) {

        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();

        if (inputNumber % 2 == 0) {
            System.out.println("Odd Number is " + inputNumber);
        } else {
            System.out.println("Even number is " + inputNumber);
        }

        System.out.println("BYE");
    }
}
