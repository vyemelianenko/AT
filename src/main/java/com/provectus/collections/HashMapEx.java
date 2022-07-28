package com.provectus.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class HashMapEx {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setUsername("Jon");
        user1.setAge(10);
        user1.setEmail("tet@gmail.com");

        System.out.println(user1.hashCode());

        Map<User,String> userMap = new HashMap<>();
        userMap.put(user1,"text");

//        user1.setAge(10);
//        user1.setEmail("tet@gmail.com");

        System.out.println(user1.hashCode());
        System.out.println(userMap.get(user1));
        System.out.println(userMap);

    }
}
