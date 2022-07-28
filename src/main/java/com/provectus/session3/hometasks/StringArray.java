package com.provectus.session3.hometasks;

import java.util.Arrays;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class StringArray {
    public static void main(String[] args) {

        String categories = "cat,car,dog";

        String[] cats = categories.split(",");

        System.out.println(categories);
        System.out.println(cats);
        System.out.println(Arrays.toString(cats));
        //Тому що масив - це окремий об'єкт в пам'яті жвм
//        І як і для звичайних класів, для нього викликається дефолтний метод toString()
//        Який виводить ім'я класу всередині масиву + хеш
//        В той час як у Arrays.toString реалізовано обхід масиву і виведення на екран значень його елементів

        for (String category : cats) {
            System.out.println("navigate to " + category);
        }

        for (int i = 0; i < cats.length; i++) {
            System.out.println("some value " + cats[i]);

        }

    }
}
