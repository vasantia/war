package com.theironyard.war;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * Created by vasantia on 6/24/16.
 */
public class Deck {
    private List<Card> cards = new ArrayList<Card>();

    public Deck(){

    }

    public void Shuffle(){
        Collections.shuffle(cards);}

    public Card dealCard(){
        return cards.remove(0);
    }

    public void addCard(Card card){
        cards.add(card);
    }

    /**
     * Creates and returns a new standard deck of cards.
     * @return
     */
    public static Deck createDeck(){
        Deck deck = new Deck();

        for(Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                deck.addCard(new Card(suit, rank));
            }
        }
        return deck;
    }
}
