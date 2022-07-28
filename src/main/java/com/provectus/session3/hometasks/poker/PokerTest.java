package com.provectus.session3.hometasks.poker;

/**
 * @author Victor Yemelianenko vemelianenko@model.com
 */

public class PokerTest {
    public static void main(String[] args) {

        SimplePoker pokerTest = new SimplePoker();
        pokerTest.сreateDeck();
        pokerTest.shuffleDeck();
        pokerTest.serveDeck(4,52);
    }
}
