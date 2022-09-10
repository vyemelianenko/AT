package com.provectus.singleTon;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class SingleTonTest {
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();

        SingleTon singleTon2 = SingleTon.getInstance();
        SingleTon singleTon3 = SingleTon.getInstance();

        System.out.println(singleTon == singleTon2);
        System.out.println(singleTon2 == singleTon3);
        System.out.println(singleTon == singleTon3);
    }
}
