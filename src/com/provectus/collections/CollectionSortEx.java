package com.provectus.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class CollectionSortEx {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i=0; i < 10; i++) {
            list.add(random.nextInt(20));
        }

        System.out.println(list);

        //MyCompator myCompator = new MyCompator();
        list.sort(new MyCompator());
        System.out.println(list);
    }
}
