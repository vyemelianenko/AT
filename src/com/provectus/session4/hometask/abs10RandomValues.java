package com.provectus.session4.hometask;

import java.util.Random;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class abs10RandomValues {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomArray = new int[10];
        double sumAllValues = 0;
        for (int i = 0; i < randomArray.length; i++) {
            int j = random.nextInt(100);
            sumAllValues += j;
            System.out.println("Each random element by index " + i + " --> " + j);
            // System.out.println("sum tep by step " + sumAllValues);
        }
        System.out.println("This is sum of all values from randomArray " + sumAllValues / randomArray.length);
    }
}

