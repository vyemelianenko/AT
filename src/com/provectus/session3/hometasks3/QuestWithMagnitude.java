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

        Scanner sc2 = new Scanner(System.in);
        int inputSecondValue = sc.nextInt();

        int absFirstValue = Math.abs(inputFirstValue);
        int absSecondValue = Math.abs(inputSecondValue);

        if (absFirstValue > absSecondValue) {
            System.out.println("magnitude of first value is " + absFirstValue + " and more then second value");
        } else {
            System.out.println("magrinude of second value is " + absSecondValue + " more then first value");
        }

        System.out.println("====================");
    }
}
