package com.provectus.session4;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class OopEx {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Spike";
        myDog.color = "grey";
        myDog.age = 4;

        myDog.canBite();
        System.out.println(myDog.bow());

        Dog friendDog = new Dog();
        friendDog.name = "Tom";
        friendDog.color = "black";
        friendDog.age = 1;

        System.out.println(friendDog.bow());
    }

}
