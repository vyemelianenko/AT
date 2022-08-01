package com.provectus.tests.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class DataProvEx {
    @Test
    public void testCollection() {
        Map<String, String> users = new HashMap<>();
        users.put("user1", "user");
        users.put("user2", "admin");
        users.put("user3", "quest");

        for (Map.Entry<String, String> entry : users.entrySet()) {
            //test roles
            System.out.println(entry.getKey());
            if (entry.getValue().equals("admin")) {
                throw new RuntimeException("admin is not ready yet");
            }
        }
    }

    @Test(dataProvider = "userProvider")
    public void testData(String username, String role) {
        System.out.println(username + " " + role);
        if (role.equals("admin")) {
            throw new RuntimeException("admin is not ready yet");
        }
    }

    @DataProvider(name = "userProvider")
    public Object[][] userProvider() {
        Object[][] result = {
                {"user1", "user"},
                {"user2", "admin"},
                {"user3", "quest"}
        };
        return result;
    }
}
