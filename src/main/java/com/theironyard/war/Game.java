package com.theironyard.war;

import java.util.ArrayList;

/**
 * Created by vasantia on 6/23/16.
 */
public class Game {

   // private Player player1;
    //private Player player2;

    ArrayList<Card> hand1 = new ArrayList<Card>();
    ArrayList<Card> hand2 = new ArrayList<Card>();
    ArrayList<Card> deck = new ArrayList<Card>();

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    System.out.println("Let's play War!");
    System.out.println("*** Round Starting ***");

    public Deck createDeck(){

    }
    public void shuffleDeck(){

    }

    public void dealDeck(){
        boolean holding = true;

        for (int count = 52, deck.length >= count, count = count - 2){
            hand1.add(deck.remove(0));
            hand2.add(deck.remove(0));
        }
    }
    public String toString(){
        return String.format("%s of %s", rank, suit);
    }
    while(hand1 >= 5 && hand2 >= 5){

        public int compareCards();{
            for (int count = 0, count > deck, count--){
                int compareCard1 = hand1(0);
                System.out.println("%s's card is the " + toString(), Player.getName());
                deck.add(hand1.remove(0));
                int compareCard2 = hand2(0);
                System.out.println("%s's card is the " + toString(), Player.getName());
                deck.add(hand2.remove(0));
                if()
                }
            }
        }


    if player1 card is > player2 card, then player1 gets to take both cards, else player2 takes both cards.
    System.out.println("%s wins with the " + Card.toString(), Player.getName());
}

