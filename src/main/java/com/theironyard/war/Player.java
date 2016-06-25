package com.theironyard.war;

import java.util.ArrayList;

/**
 * Created by vasantia on 6/23/16.
 */
public class Player {

    private String name;

    public Player(){

    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//  Player will have giveCard method remove card and set value to a variable, then can compare the variables.
//  Player will have getCard method

//  Might want to think about putting these methods in the game class instead....pros? cons?

}
