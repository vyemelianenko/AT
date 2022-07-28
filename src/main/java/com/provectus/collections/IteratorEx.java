package com.provectus.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class IteratorEx {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("");
        list.add("one");
        list.add("");
        list.add("two");
        list.add("");
        list.add("three");
//
//        for (int i = 0; i <list.size() ; i++) {
//            if (list.get(i).isEmpty()) {
//                list.remove(i);
//            }
//        }
//
//        for (String s : list) {
//            if (s.isEmpty()) {
//                list.remove(s);
//            }
//        }
//        System.out.println(list);
//    }

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String s = iterator.next();
            if (s.isEmpty()) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
