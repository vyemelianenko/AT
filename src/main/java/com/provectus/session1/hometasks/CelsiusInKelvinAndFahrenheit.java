package com.provectus.session1.hometasks;

import java.util.Scanner;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class CelsiusInKelvinAndFahrenheit {
    public static void main(String[] args) {

        double fahrenheit;
        double kelvin;

        System.out.println("Enter a Celsious");

        Scanner sc = new Scanner(System.in);
        float celsius = sc.nextFloat();

        System.out.println("The Celsius is: " + celsius);

        fahrenheit = (celsius * 9) / 5 + 32;
        System.out.println("The Kelvin is: " + fahrenheit);

        kelvin = celsius + 273.16;
        System.out.println("The Fahrenheit is " + kelvin);

    }
}
