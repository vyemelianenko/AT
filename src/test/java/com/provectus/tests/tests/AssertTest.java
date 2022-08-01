package com.provectus.tests.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class AssertTest {
    @Test
    public void ssertTest() {
        System.out.println("before assert");
        String assertValue = "actual";

        Assert.assertEquals(assertValue, "actual", "actual value is incorrect");
        assertValue = "not actual";
        Assert.assertEquals(assertValue, "actual", "actual value is incorrect");
        System.out.println("after assert");
    }
}
