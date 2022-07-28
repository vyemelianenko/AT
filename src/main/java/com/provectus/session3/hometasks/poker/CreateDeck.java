package com.provectus.session3.hometasks.poker;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class CreateDeck {
    private static int noOfCards = 52;
    private static String[] deck = new String[noOfCards];

    public String[] сreateDeck() {

        String[] suites = {"Hearts", "Clubs", "Diamonds", "Sparrows"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int count = 0;
        for (String suit : suites) {
            for (String value : values) {
                deck[count++] = value + " of " + suit;
            }
        }
        return deck;
    }
}
