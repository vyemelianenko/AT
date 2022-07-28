package com.provectus.collections;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class TresetEx {
    public static void main(String[] args) {
        Set<User> userSet = new TreeSet<>();

        User user1 = new User();
        user1.setUsername("John");
        user1.setAge(18);

        User user2 = new User();
        user2.setUsername("Sensa");
        user2.setAge(22);

        User user3 = new User();
        user3.setUsername("Aria");
        user3.setAge(15);

//        User user3 = new User();
//        user3.setUsername("White");

        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);

        System.out.println(userSet);
    }
}
