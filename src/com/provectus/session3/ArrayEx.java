package com.provectus.session3;

import java.util.Arrays;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class ArrayEx {
    public static void main(String[] args) {

        int[] intArray = new int[10];

        System.out.println(Arrays.toString(intArray));

        float[] floatArray = {1f, 1f, 3f, 3f, 6f};
        System.out.println(Arrays.toString(floatArray));

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 3;
        }
        System.out.println(Arrays.toString(intArray));

        System.out.println("For each");
        //[0, 3, 6, 9, 12, 15, 18, 21, 24, 27]
        for (int item : intArray) {
            System.out.println("take item copied from intarray " + item); //item = 3
            item = item + 5; //item = 3+5  intarray[1]
            System.out.println("item after manipulation " + item);
        }
        System.out.println(Arrays.toString(intArray));
        System.out.println("done");
    }

}
