package com.provectus.session4.oop.driver;

import java.util.Random;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class UITest {
    public static void main(String[] args) {
        WebDriver driver = getDriver();
        driver.open();
        driver.navigate("google.com","prefix");

        driver.close();
    }


    private static WebDriver getDriver() {
        int random = new Random().nextInt(6);
        WebDriver driver = random % 2 == 0 ? new ChromeDriver() : new GeckoDriver();


        /*
        if (valueFromConfig.equals(*chrome)) {
        driver = new ChromeDriver();
        }

        if (valueFromConfig.equals(*firefox)) {
        driver = new FireFoxDriver();
        }
        return driver;
         */


        return driver;
    }

}
