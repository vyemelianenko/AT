package com.provectus.collections.homeTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class Cinderella {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> listOfCinderella = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listOfCinderella.add(random.nextInt(100));
        }
        System.out.println("Random listOfCinderella: " + listOfCinderella);

        List<Integer> listDivideOnThe2 = new ArrayList<>();
        List<Integer> listDivideOnThe3 = new ArrayList<>();

        for (int s : listOfCinderella) {
            if (s % 2 == 0 && s % 3 == 0) {
                listDivideOnThe2.add(s);
                listDivideOnThe3.add(s);
            } else if (s % 3 == 0) {
                listDivideOnThe3.add(s);
            } else if (s % 2 == 0) {
                listDivideOnThe2.add(s);
            }
        }

        System.out.println("Result listDivideOnThe2: " + listDivideOnThe2);
        System.out.println("Result listDivideOnThe3: " + listDivideOnThe3);
    }
}
