package com.provectus.session1.hometasks;
import java.util.Scanner;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class TriagleSq {
    public static void main(String[] args) {

        System.out.println("Enter katet1:");
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();


        System.out.println("Enter katet2:");
        Scanner sc2 = new Scanner(System.in);
        float y = sc2.nextFloat();

        double square = (x * y) / 2;
        System.out.println("Square of triangle is " + square);
    }

}
