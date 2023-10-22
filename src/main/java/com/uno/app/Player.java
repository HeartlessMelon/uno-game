package com.uno.app;

import java.util.ArrayList;

public class Player{

    // Class member variables
    private ArrayList<Card> hand;
    private String name;

    // Getters
    public ArrayList<Card> getHand(){
        return this.hand;
    }

    // Contructor
    public Player(String name){
        this.hand = new ArrayList<Card>();
        this.name = name.equals("") || name==null? "RACH": name;// Gives default name in case of no name
    }


    /* TODO
    * Given an index this should return a Card at that position and removes that Card from the hand
    * @param i - Index position 
    */
    public Card playCard(int i){
        return new Card();
    }

}