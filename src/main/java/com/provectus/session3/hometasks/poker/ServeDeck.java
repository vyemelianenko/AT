package com.provectus.session3.hometasks.poker;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class ServeDeck {
    private static int noOfCards = 52;
    private static int noOfPlayers = 4;
    private static String[] deck = new String[noOfCards];

    public String[] serveDeck(int noOfPlayers,String[] deck) {

        int count = 0;
        for (int round = 1; round <= 5; round++) {
            System.out.println("====Round " + round + "====");
            for (int player = 1; player <= noOfPlayers; player++) {
                System.out.printf("Player %s gets card: %s%n ", player, deck[count++]);
            }
            System.out.println();
        }
        return deck;
    }
}
