package com.provectus.singleTon;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class SingleTon {

    private static SingleTon instance;


    private SingleTon() {

    }

    public static SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }
}
