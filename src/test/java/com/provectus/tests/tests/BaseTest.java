package com.provectus.tests.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class BaseTest {
    @BeforeClass
    public void setUp() {
        System.out.println("start browser");
        System.out.println("begin ui test");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        System.out.println("UI tet Completed");
        System.out.println("Kill session ");
    }

}
