package com.provectus.nestedClasses.anonClass;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class AnonClassEx {
    public static void main(String[] args) {
        Iface iface = new IfaceImpl();
        iface.doSmth();

        Iface annonIface = new Iface() {
            @Override
            public void doSmth() {
                System.out.println("anon = done");
            }

            @Override
            public String getsmth() {
                return "anon - 456";
            }
        };

        annonIface.doSmth();
    }
}
