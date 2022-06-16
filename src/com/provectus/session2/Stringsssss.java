package com.provectus.session2;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class Stringsssss {
    public static void main(String[] args) {

        String str1 = "Some Text Today";
        String str2 = null;

        String result1 = str1.toUpperCase();
        String result2 = str1.toLowerCase();

        System.out.println(result1);
        System.out.println(result2);

//        String formatted = String.format("result of %s and %s",result1,result2);
        String formatted = String.format("result of %s and %d %f",result1 , 5,5.6);

        System.out.println(formatted);
    }

}
