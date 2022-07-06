package com.provectus.session5;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class UserPageWithAcceptPolicy {

    public void userRegisterWithAcceptedPolicyTest() {
        UserPage userPage = new UserPage();
        userPage.registerUser("user3", true);
    }

    public void userRegisterWithoutAcceptedPolicy() {
        UserPage userPage = new UserPage();
        userPage.registerUser("user3", false);

    }
}
