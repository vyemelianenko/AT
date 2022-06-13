package com.provectus.session4.hometask;

import java.util.Random;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class changeOddRandomValueToZero {
    public static void main(String[] args) {

        Random random = new Random();
        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            int j = random.nextInt(100);
            if (j % 2 == 0) {
                j = 0;
            }
            System.out.println(j);
        }
    }
}


