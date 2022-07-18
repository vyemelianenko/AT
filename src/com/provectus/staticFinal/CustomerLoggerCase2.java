package com.provectus.staticFinal;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class CustomerLoggerCase2 {
    private static final String BLUE_BOLD_BRIGHT = "\033[1;94m";
    private static final String RED_BOLD_BRIGHT = "\033[1;91m";
    private static final String GREEN_BOLD_BRIGHT = "\033[1;92m";
    private static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";

    public static void info(String message) {
        System.out.println(YELLOW_BOLD_BRIGHT.concat(message));
    }

    public static void debug(String message) {

        System.out.println(BLUE_BOLD_BRIGHT.concat(message));
    }

    public static void error(String message) {
        System.out.println(RED_BOLD_BRIGHT.concat(message));
    }

    public static void warning(String message) {
        System.out.println(GREEN_BOLD_BRIGHT.concat(message));
    }


}
