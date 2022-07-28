package com.provectus.staticFinal.logger;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class MethodLogger {

    private enum LogLevel {
        DEBUG("green"),
        INFO("cyan"),
        WARN("yellow"),
        ERROR("red");


        private String color;

        LogLevel(String color) {
            this.color = color;
        }

        private String getColor() {
            return color;
        }
    }
//
//    public void info(String message) {
//        System.out.println(printMessage(MethodLogger.,"message info");
//    }
//
//    public void debug(String message) {
//
//    }
//
//    public void error(String message) {
//    }
//
//    public static void printMessage(LogLevel level, String message) {
//        System.out.println(level.getColor() +  message);
//    }
}
