package com.provectus.tests.tests;

import com.provectus.tests.tests.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class Before3 extends BaseTest {

    @Parameters ({"testParam"})
    @Test
    public void test1(String param) {
        System.out.println("test1 with " + param);
    }
}
