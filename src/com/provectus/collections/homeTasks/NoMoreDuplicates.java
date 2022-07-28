package com.provectus.collections.homeTasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class NoMoreDuplicates {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> randomListWithDuplicate = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            randomListWithDuplicate.add(random.nextInt(10));
        }
        System.out.println(randomListWithDuplicate);
        long start0 = System.currentTimeMillis();
        for (int i = 0; i < randomListWithDuplicate.size(); i++) {
            for (int j = i + 1; j < randomListWithDuplicate.size(); j++) {
                if (randomListWithDuplicate.get(i).equals(randomListWithDuplicate.get(j))) {
                    randomListWithDuplicate.remove(j);
                    j--;
                }
            }
        }
        long stop0 = System.currentTimeMillis();
        System.out.println("time in the sec: " + (stop0 - start0) + " randomList : " + randomListWithDuplicate);

        List<Integer> notRandomList = new ArrayList<>();
        notRandomList.add(1);
        notRandomList.add(2);
        notRandomList.add(33);
        notRandomList.add(33);
        notRandomList.add(4);
        notRandomList.add(4);
        long start1 = System.currentTimeMillis();
        //method of duplicate
        notRandomList = notRandomList.stream().distinct().collect(Collectors.toList());
        //
        long stop1 = System.currentTimeMillis();
        System.out.println("time in the sec: " + (stop1 - start1) + " notRandomList: " + notRandomList);

        HashSet<String> noDuplicatesAnyMore = new HashSet<String>();
        long start2 = System.currentTimeMillis();
        noDuplicatesAnyMore.add("level1");
        noDuplicatesAnyMore.add("level2");
        noDuplicatesAnyMore.add("level1");
        noDuplicatesAnyMore.add("level3");
        noDuplicatesAnyMore.add("level1");
        noDuplicatesAnyMore.add("level4");

        //method of duplicate
        long stop2 = System.currentTimeMillis();
        System.out.println("time in the sec: " + (stop2 - start2) + " noDuplicatesAnyMore: " + noDuplicatesAnyMore);


    }
}
