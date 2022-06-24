package com.provectus.session4.oop.driver;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class GeckoDriver implements WebDriver {
    @Override
    public void open() {
        System.out.println("Open FireFox");
    }

    @Override
    public void navigate(String url,String prefix) {
        System.out.println("Navigate to FireFox " + url);
    }

    @Override
    public void close() {
        System.out.println("Close FireFox");
    }
}
