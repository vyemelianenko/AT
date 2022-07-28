package com.provectus.session3.hometasks;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class changeOddRandomValueToZero {
    public static void main(String[] args) {

        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = getRandomValue();
        }
        System.out.print("Array after filled random values ");
        System.out.println(Arrays.toString(randomArray));

        for (int j = 0; j < randomArray.length; j++) {
            if (randomArray[j] % 2 == 0) {
                randomArray[j] = 0;
            }
        }
        System.out.print("Array after all odd values shange to 0 ");
        System.out.println(Arrays.toString(randomArray));
    }


    private static int getRandomValue() {
        Random random = new Random();
        return random.nextInt(100);
    }
}


