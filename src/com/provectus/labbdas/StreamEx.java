package com.provectus.labbdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class StreamEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("","12", "", "45", "17", "", "5");
        List<String> notEmptyList = new ArrayList<>();
        for (String s : list) {
            if (!s.isEmpty()) {
                notEmptyList.add(s);
            }
        }

        System.out.println(notEmptyList);

        List<Integer> nums = new ArrayList<>();
        for (String s : notEmptyList) {
            nums.add(Integer.valueOf(s));
        }

        System.out.println(nums);

        List<Integer> percents = new ArrayList<>();
        for (int i : nums) {
            percents.add(i * 100);
        }
        System.out.println(percents);


        List<Integer> sPercents = list.stream().filter(s -> !s.isEmpty()).map(s -> Integer.valueOf(s)).map(n -> n * 100).collect(Collectors.toList());
        System.out.println(sPercents);

//        list.forEach(s -> {
//            Integer val = Integer.valueOf(s);
//            System.out.println(val);
//        });
        Integer optional = list.stream().filter(s -> !s.isEmpty()).map(s -> Integer.valueOf(s)).map(n -> n * 100).findFirst().orElseThrow(() -> new RuntimeException("no data in stream"));
        System.out.println(optional);
//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        }

    }
}
