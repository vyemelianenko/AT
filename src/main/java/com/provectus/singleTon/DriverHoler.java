package com.provectus.singleTon;

import org.openqa.selenium.WebDriver;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class DriverHoler {
    private static DriverHoler holder;
    private WebDriver driver;

    private DriverHoler() {
    }

    public static DriverHoler getHolder() {
        if (holder == null) {
            holder = new DriverHoler();
        }
        return holder;
    }

    public static void setDriver(WebDriver driver) {
        getHolder().driver = driver;
    }

    public static WebDriver getDriver(){
        return getHolder().driver;
    }
}
