package com.provectus.tests.tests;

import org.testng.annotations.Test;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class Test2 {
    @Test
    public void test1() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("test is passed");
        }
    }
}
