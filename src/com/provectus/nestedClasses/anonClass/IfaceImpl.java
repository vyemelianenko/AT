package com.provectus.nestedClasses.anonClass;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class IfaceImpl implements Iface{
    @Override
    public void doSmth() {
        System.out.println("done");
    }

    @Override
    public String getsmth() {
        return "123";
    }
}
