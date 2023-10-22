package com.uno.app;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Collections;
import java.util.Stack;

public class Game{

    // Class member variables
    private Stack<Card> deck;
    private Queue<Player>  players;


    // Getters
    public Stack<Card> getDeck() { return this.deck; }

    // Contructor
    public Game(){
        this.deck = new Stack<Card>();
        this.players = new LinkedList<Player>();
    }
    public Game(int numPlayers){
        this.deck = new Stack<Card>();
        this.players = new LinkedList<Player>();
        this.createDeck();
        this.shuffleDeck();
    }
    

    /*
    * pushs a Player into a queue
    * param name - The name of the player being pushed
    */
    public void pushPlayer(String name){
        Player tmpPlayer = new Player(name);
        players.add(tmpPlayer);
    }

    public void drawCards(Player p){
        
    }
    /*
    *  Creates a new UNO deck with 108 cards
    */
    public void createDeck(){
        for(CardFunction f: CardFunction.values()){
            for(CardColor c: CardColor.values()){
                    Card tmpcard = new Card(c, f);
                    if(c == CardColor.WILD && (f == CardFunction.WILD|| f == CardFunction.DRAW4)){
                        deck.push(tmpcard);
                        deck.push(tmpcard);
                        deck.push(tmpcard);
                        deck.push(tmpcard);
                        System.out.println("triggered");
                        }
                    else if(c != CardColor.WILD && f != CardFunction.WILD && f != CardFunction.DRAW4){
                            deck.push(tmpcard);
                            if(f!=CardFunction.NUM0){
                            deck.push(tmpcard);
                            }
                    }
            }
        }
    }


    public void shuffleDeck(){
        Collections.shuffle(this.deck);
    }

    

}

