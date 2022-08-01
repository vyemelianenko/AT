package com.provectus.tests;

import org.testng.annotations.Test;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */
@Test
public class TestEx {
    @Test(enabled = false, groups = {"login", "critical"}, description = "My first anotation", priority = 40)
    public void testExample() {
        System.out.println("I am test");
        System.out.println("running test on " + System.getProperty("url"));
    }

    @Test(priority = 14)
    public void test4() {

    }

    @Test(groups = {"cart", "major"}, priority = 10)
    public void test2() {
    }

    @Test(priority = 20)
    public void test3() {
    }
}
