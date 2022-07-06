package com.provectus.session5;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class ChildClass2 extends ChildClass {

    private String childValue2;

    public ChildClass2(String childValue2) {
        super("childValue2");
        this.childValue2 = childValue + " " + childValue2;
        System.out.println("Create childClass2");
    }
}
