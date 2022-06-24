package com.provectus.session4.oop.driver;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class ChromeDriver implements WebDriver {
    @Override
    public void open() {
        System.out.println("Open Chrome browser");
    }

    @Override
    public void navigate(String url,String prefix) {
        System.out.println("Navigate Chrome browser " + url);
    }

    @Override
    public void close() {
        System.out.println("Close Chrome browser");
    }
}
