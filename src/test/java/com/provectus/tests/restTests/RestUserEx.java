package com.provectus.tests.restTests;

import com.provectus.rest.entities.RestUser;
import com.provectus.rest.entities.User;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class RestUserEx {
    @Test(priority = 10)
    public void restUserEx() throws IOException {
        RestUser restTest = new RestUser();

        User user1 = new User();
        user1.setUsername("user1");
        user1.setEmail("user1@gmail.com");
        user1.setFirstName("David");
        user1.setLastName("Polonksii");
        user1.setPassword("1234!");
        user1.setId(77878);

        //create new user
        Integer responseCode = restTest.createUser(user1);
        assertEquals(responseCode, Integer.valueOf(200), "Response code should be 200");

        //found by new user
        String userByName = restTest.getUserByName(user1);
        assertEquals(userByName,"user1","Useranme should be user1");

        //login by new user
        Integer responceCodeLogin = restTest.loginUser(user1);
        assertEquals(responceCodeLogin,Integer.valueOf(200),"Login credentials should be correct");

        //logout by new user
        Integer responceCodeLogout = restTest.logoutUser(user1);
        assertEquals(responceCodeLogout,Integer.valueOf(200),"Logout should be correct");

        //updateUser
        String updateUser = restTest.updateUser(user1);
        assertEquals(updateUser,String.valueOf(200),"User should be updated");

        //delete user
        Integer responseCodeDelete = restTest.deleteUser(user1);
        assertEquals(responseCodeDelete,Integer.valueOf(200),"User should be deleted");


    }
}
