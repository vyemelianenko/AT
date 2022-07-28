package com.provectus.collections;

import java.util.*;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> stringList = new LinkedList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("one");

        System.out.println(stringList.size());

        System.out.println(stringList);
        System.out.println("aaaaa " + stringList.get(1));
        stringList.get(1);



        List<Double> doulbeList = new ArrayList<>();
//        double d = doulbeList.get(0);
        for (int i = 0; i<stringList.size();i++){
            System.out.println(stringList.get(i));
        }

        for (String s : stringList) {
            System.out.println(s);
        }

        String [] arraywithDups = {"one","two","three"};
        Set<String> setWithOutDups = new HashSet<>();
        setWithOutDups.addAll(Arrays.asList(arraywithDups));

        for (String jjj: setWithOutDups) {
            System.out.println("setWithOutDups :" + jjj);
        }
    }
}
