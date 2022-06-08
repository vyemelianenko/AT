package com.provectus.session3.hometasks3;

import java.util.Scanner;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class QuestWithMagnitude {
    public static void main(String[] args) {

        System.out.println("====================");
        System.out.println("Enter a first value");

        Scanner sc = new Scanner(System.in);
        int inputFirstValue = sc.nextInt();

        System.out.println("Enter a second value");

        int inputSecondValue = sc.nextInt();

        if (Math.abs(inputFirstValue) > Math.abs(inputSecondValue)) {
            System.out.println("magnitude of first value is " + inputFirstValue + " and more then second value");
        } else {
            System.out.println("magrinude of second value is " + inputSecondValue + " more then first value");
        }

        System.out.println("====================");
    }
}
