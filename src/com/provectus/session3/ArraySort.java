package com.provectus.session3;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class ArraySort {

    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomValue();
        }
        System.out.println(Arrays.toString(array));

        boolean needSort = true;
        while (needSort) {
            needSort = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    needSort = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static int getRandomValue() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
