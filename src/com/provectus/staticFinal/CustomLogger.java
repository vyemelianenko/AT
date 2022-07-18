package com.provectus.staticFinal;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class CustomLogger {

    private static final String RED_BOLD_BRIGHT = "\033[1;91m";
    private static final String GREEN_BOLD_BRIGHT = "\033[1;92m";
    private static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";
    private static final String BLUE_BOLD_BRIGHT = "\033[1;94m";

    public static void customLogger(LoggerLevels loggerLevels, String message) {
        switch (loggerLevels) {
            case WARNING:
                System.out.println(YELLOW_BOLD_BRIGHT + loggerLevels.getValue() + " : " + message);
                break;
            case ERROR:
                System.out.println(RED_BOLD_BRIGHT + loggerLevels.getValue() + " : " + message);
                break;
            case DEBUG:
                System.out.println(BLUE_BOLD_BRIGHT + loggerLevels.getValue() + " : " + message);
                break;
            case INFORMATION:
                System.out.println(GREEN_BOLD_BRIGHT + loggerLevels.getValue() + " : " + message);
                break;
        }
    }

    public enum LoggerLevels {
        WARNING("warning"),
        ERROR("error"),
        INFORMATION("information"),
        DEBUG("debug");


        private String value;

        LoggerLevels(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
