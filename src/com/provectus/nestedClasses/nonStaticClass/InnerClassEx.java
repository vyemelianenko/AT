package com.provectus.nestedClasses.nonStaticClass;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class InnerClassEx {
    public void InnerClass() {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

    }
}
