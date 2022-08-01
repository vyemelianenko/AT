package com.provectus.tests.tests;

import com.provectus.tests.tests.BaseTest;
import org.testng.annotations.*;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class Before2 extends BaseTest {
//    @BeforeSuite
//    public void BeforeSuite() {
//        System.out.println("BeforeSuite");
//    }
//
//    @BeforeTest
//    public void BeforeTest() {
//        System.out.println("BeforeTest");
//    }

//    @BeforeClass
//    public void BeforeClass() {
//        System.out.println("BeforeClass");
//    }

    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("BeforeMethod");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("AfterMethod");
    }

//    @AfterClass
//    public void AfterClass() {
//        System.out.println("AfterClass");
//    }
//
//    @AfterTest
//    public void AfterTest() {
//        System.out.println("AfterTest");
//    }
//
//    @AfterSuite
//    public void AfterSuite() {
//        System.out.println("AfterSuite");
//    }

}
