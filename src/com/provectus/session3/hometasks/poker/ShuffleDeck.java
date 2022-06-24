package com.provectus.session3.hometasks.poker;

import java.util.Random;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class ShuffleDeck {
    private static int noOfCards = 52;
    private static int noOfPlayers = 4;
    private static String[] deck = new String[noOfCards];

    public void shuffleDeck() {

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int in = random.nextInt(noOfCards);
            int out = random.nextInt(noOfPlayers);

            String tmpCard = deck[in];
            deck[in] = deck[out];
            deck[out] = tmpCard;
        }
    }
}
