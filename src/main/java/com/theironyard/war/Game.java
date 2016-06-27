package com.theironyard.war;

import java.util.ArrayList;

/**
 * Created by vasantia on 6/23/16.
 */
public class Game {

    private Player player1;
    private Player player2;

    ArrayList<Card> hand1 = new ArrayList<Card>();
    ArrayList<Card> hand2 = new ArrayList<Card>();
    ArrayList<Card> deck = new ArrayList<Card>();

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    public void dealDeck(){

        int listSize = deck.size();

        for (int count = 52, listSize >= count, count = count - 2){
            hand1.add(deck.remove(0));
            hand2.add(deck.remove(0));
        }
    }
    public String toString(){
        return String.format("%s of %s", Card.rank, Card.suit);
    }
    public void runGame() {

//        public Deck createDeck();
//
//        public void dealDeck();
//
//        public void shuffleDeck(){
//
//        }

        System.out.println("Let's play War!");
        System.out.println("*** Round Starting ***");

        while (hand1.size() >= 5 && hand2.size() >= 5) {
                for (int count = 0, count > deck.size(), count--){
                    int compareCard1 = Rank.getValue(hand1(0)); //Need to find value of hand1(0)
                    return compareCard1;
                    System.out.println("%s's card is the " + Card.toString(), player1.getName());
                    deck.add(hand1.remove(0));
                    int compareCard2 = hand2(0);
                    return compareCard2;
                    System.out.println("%s's card is the " + Card.toString(), player2.getName());
                    deck.add(hand2.remove(0));

                    if (compareCard1 == compareCard2){
                        war();
                    }
                    else if(compareCard1 > compareCard2){
                        hand1.add(deck.removeRange(0,1));
                        System.out.printf("%s wins with the " + Card.toString(), player1.getName());
                    }
                    else if(compareCard2 > compareCard1){
                        hand2.add(deck.removeRange(0,1));
                        System.out.printf("%s wins with the " + Card.toString(), player2.getName());
                }
            }
        }
    }


    public void war(){
        System.out.println("#### WAR!!!! ####");

        while (hand1(5) == hand2(5)) {

            int compareCard1 = hand1(5);
            System.out.println("%s's card is the " + Card.toString(), player1.getName());
            deck.add(hand1.removeRange(0, 4));
            int compareCard2 = hand2(5);
            System.out.println("%s's card is the " + Card.toString(), player2.getName());
            deck.add(hand2.removeRange(0, 4));
            if (compareCard1 > compareCard2){
                hand1.add(deck.removeRange(0, 9));
                System.out.printf("%s wins the WAR!", player1.getName());
            }
            else(compareCard2 > compareCard1){
                hand2.add(deck.removeRange(0, 9));
                System.out.printf("%s wins the WAR!", player2.getName());
            }
        }
    }
}

