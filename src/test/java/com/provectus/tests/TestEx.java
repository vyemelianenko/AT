package com.provectus.tests;

import org.testng.annotations.Test;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class TestEx {
    @Test
    public void testExample() {
        System.out.println("I am test");
        System.out.println("running test on " + System.getProperty("url"));
    }
}
