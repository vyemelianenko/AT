package com.provectus.staticFinal;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class StaticRunner {
    public static void main(String[] args) {
        StaticEx staticEx = new StaticEx();

        StaticEx staticEx1 = new StaticEx();

        staticEx.increseCounter();
        staticEx1.increseCounter();

        System.out.println(staticEx.counter);
        System.out.println(staticEx1.counter);

        staticEx.increseCounter();
        staticEx.decreaseCounter();

        System.out.println(staticEx.getCounter());

        TestUnit1.getCountFromString("123");

        System.out.println(ApiConfig.URL);
        System.out.println(ApiConfig.AUTH_HEDEAR);

        CustomLogger.customLogger(CustomLogger.LoggerLevels.WARNING,"this is warning");
        CustomLogger.customLogger(CustomLogger.LoggerLevels.DEBUG,"this is DEBUG");
        CustomLogger.customLogger(CustomLogger.LoggerLevels.ERROR,"this is ERROR");
        CustomLogger.customLogger(CustomLogger.LoggerLevels.INFORMATION,"this is infofofoffofofofofoofof");

        System.out.println("======== case2 ========");

        CustomerLoggerCase2.warning("case2222222 warn");
        CustomerLoggerCase2.error("errorrorororororrorororor");
        CustomerLoggerCase2.debug("debugggggg");
        CustomerLoggerCase2.info("infofofofofofofoo");
    }
}
