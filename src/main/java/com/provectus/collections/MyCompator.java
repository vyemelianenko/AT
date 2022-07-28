package com.provectus.collections;

import java.util.Comparator;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class MyCompator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 %2 == 0 && o2%2 != 0) return -1;
        if (o1 % 2 != 0 && o2%2 == 0) return 1;
        return 0;
    }
}
