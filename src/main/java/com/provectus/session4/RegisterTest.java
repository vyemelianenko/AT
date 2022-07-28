package com.provectus.session4;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class RegisterTest {

    public static void main(String[] args) {
        RegisterPage registerPage = new RegisterPage();
        registerPage.registerUser("user1", "pass1", "test@gmail.com", "usd");

        User user = new User(); //object 1
        user.setUsername("user");
        user.setPassword("1235678");
        user.setEmail("test@gmail.com");
        user.setCurrency("usd");
//        user.setTimezone("EU/Kyiv"); ;

        User user1 = new User(); //object 2
//        User user1 = user; //записати силку на переміну типа user
        user1.setPassword("12345");
        user1.setUsername("user1");

//        System.out.println(user == user1);
//        System.out.println(user.equals(user1));

        System.out.println(user);

        registerPage.registerUser(user);
        System.out.println(user1);
    }


}
