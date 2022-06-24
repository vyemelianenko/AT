package com.provectus.session4;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class Dog {
    String name;
    String breed;
    String color;
    int age;

    public String bow() {
        return name + " says Bow-Wow";
    }

    public boolean canBite() {
        return true;
    }
}
