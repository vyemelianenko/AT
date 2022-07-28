package com.provectus.nestedClasses.nonStaticClass;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class OuterClass {
    public void outerMethod() {
//        this.new InnerClass().p1;
    }

    class InnerClass {
        public String p1,p2;
    }
}
