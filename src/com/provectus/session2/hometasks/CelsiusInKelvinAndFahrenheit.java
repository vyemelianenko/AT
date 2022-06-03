package com.provectus.session2.hometasks;

import java.util.Scanner;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class CelsiusInKelvinAndFahrenheit {
    public static void main(String[] args) {

        float y;
        double z;

        System.out.println("Enter a Celsious");

        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();

        System.out.println("The Celsius is: " + x);

        y = (x * 9) / 5 + 32;
        System.out.println("The Kelvin is: " + y);

        z = x + 273.16;
        System.out.println("The Fahrenheit is " + z);

    }
}
