package com.provectus.collections;

import java.util.*;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */
// швидкість - - - - - -що швидше сотрирує ,чим менше - ти краще
public class ListSort {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <20000 ; i++) {
            integerList.add(random.nextInt(1000));
        }

        List<Integer> arrayList = new ArrayList<>(integerList);
        List<Integer> linkedList = new LinkedList<>(integerList);


        long start = System.currentTimeMillis();
        sortList(arrayList);
        long stop = System.currentTimeMillis();
        System.out.println("sort arrayList " + (stop-start));

         start = System.currentTimeMillis();
        sortList(linkedList);
         stop = System.currentTimeMillis();
        System.out.println("sort linkedList " + (stop-start));

        start = System.currentTimeMillis();
        Collections.sort(integerList);
        stop = System.currentTimeMillis();
        System.out.println("native sorting  " + (stop-start));
    }

    private static void sortList(List<Integer> list) {
        boolean needSort = true;
        while(needSort) {
            needSort = false;
            for (int i = 0; i <list.size()-1 ; i++) {
                int l =list.get(i);
                int r = list.get(i+1);
                if (l > r) {
                    list.set(i,r);
                    list.set(i+1,1);
                    needSort = true;
                }
            }
        }
    }
}
