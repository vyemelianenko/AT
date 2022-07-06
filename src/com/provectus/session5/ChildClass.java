package com.provectus.session5;

import java.util.Locale;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class ChildClass extends Construct {

    protected String childValue = "default";

//    public ChildClass(String childValue) {
////    super(childValue);
//
//    }

    public ChildClass(String childValue) {
        super(childValue);
        this.childValue = value.toLowerCase()+ " " + childValue;
        System.out.println("create ChildClass");
    }

    public String getChildValue() {
        return this.childValue;
    }
}
