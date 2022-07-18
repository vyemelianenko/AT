package com.provectus.staticFinal;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class StaticEx {

    static final Logger LOGGER = Logger.getLogger(StaticEx.class.getName());

    public static String staticVar = "static_var";
    public static int counter = 0;
    public String nonStaticVar = "non_static";

    public static int getCounter() {
        return counter;
    }

    public void increseCounter() {
        LOGGER.log(Level.INFO, "increase counter");
        counter++;
    }

    public void decreaseCounter() {
        LOGGER.log(Level.WARNING, "decrease conuter warning");
        counter--;
    }


}
