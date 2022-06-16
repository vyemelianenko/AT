package com.provectus.session2.hometasks3;
import java.util.Scanner;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class PifagorHowAreDoin {

    public static void main(String[] args) {
        System.out.println("==============");

        System.out.println("Enter an A");

        Scanner sc = new Scanner(System.in);
        double inputA = sc.nextDouble();

        System.out.println("Enter an B");

        double inputB = sc.nextDouble();

        System.out.println("Enter an C");

        double inputC = sc.nextDouble();

        double resultOfPifagor = inputA * inputA + inputB * inputB;
        double hypotenuseSquared = Math.pow(inputC, 2);

        if (resultOfPifagor == hypotenuseSquared) {
            System.out.println("This is correct triangle");
        } else {
            System.out.println("It is not a correct triangle");
        }


        System.out.println("==============");
    }
}
