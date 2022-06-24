package com.provectus.session4.oop.driver;

public interface WebDriver {

    void open();

    void navigate(String url,String prefix);

    void close();

}
