package com.provectus.staticFinal.logger;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class LevelLogger {
    private static String RED = "red";
    private static String GREEN = "green";

    public void log(LogLevel level, String message) {
        switch (level) {
            case DEBUG:
                System.out.println(RED + message);
                break;
            case ERROR:
                System.out.println(GREEN + message);
                break;
        }
    }

    public enum LogLevel {
        DEBUG,
        INFO,
        WARN,
        ERROR;
    }
}
