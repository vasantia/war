package com.theironyard.war;

/**
 * Created by vasantia on 6/23/16.
 */
public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Fred");
        Player player2 = new Player("George");
        Game game = new Game(player1, player2);
        game.runGame();


    }
}
