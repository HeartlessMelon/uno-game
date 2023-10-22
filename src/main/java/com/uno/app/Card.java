package com.uno.app;

public class Card{

    private CardColor color;
    private CardFunction function;


    public Card(){};
    public Card(CardColor color, CardFunction function){
        this.color = color;
        this.function = function;
    }

    public CardColor getColor(){
        return this.color;
    }
    public CardFunction getFunction(){
        return this.function;
    }




    public boolean isEqual(Card card2) {
        return this.color == card2.getColor() && this.function == card2.getFunction();
    }
    
}