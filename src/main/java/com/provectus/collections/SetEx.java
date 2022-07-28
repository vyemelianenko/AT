package com.provectus.collections;

import java.util.*;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class SetEx {
    public static void main(String[] args) {
//        Set<String> strings = new HashSet<>();
//        Set<String> strings = new LinkedHashSet<>();
        Set<Integer> integerSet = new TreeSet<>();

        Random random = new Random();
        for (int i = 0; i <50 ; i++) {
            integerSet.add(random.nextInt(200));
        }

//        for (Integer s:integerSet) {
//            System.out.println(s);
//        }
        System.out.println(integerSet);
    }
}
