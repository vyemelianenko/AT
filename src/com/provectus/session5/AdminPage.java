package com.provectus.session5;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class AdminPage extends UserPage {

    @Override
    public String getUserInfo() {
        String s = super.getUserInfo();
        return s + " and admin info";
    }

}
