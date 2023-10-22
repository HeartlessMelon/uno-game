package com.uno.app;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class GameTest {
    Game testGame;
    @Test //TODO
    public void testCreateDeck() {
        testGame = new Game();
        testGame.createDeck();
        assertEquals(108 , testGame.getDeck().size());

        // Checks if the created deck has the proper amount of colored cards
        List<Card> stacktolist = new ArrayList<Card>(testGame.getDeck());                     
        int occurenceBLUE = Collections.frequency(stacktolist, CardColor.BLUE);
        assertEquals(25 , occurenceBLUE); 
        int occurenceGREEN = Collections.frequency(stacktolist, CardColor.GREEN);
        assertEquals(25 , occurenceGREEN); 
        int occurenceYELLOW = Collections.frequency(stacktolist, CardColor.YELLOW);
        assertEquals(25 , occurenceYELLOW); 
        int occurenceRED = Collections.frequency(stacktolist, CardColor.RED);
        assertEquals(25 , occurenceRED); 
    }
    //TODO
    public void testShuffleDeck(){
        testGame = new Game();
        testGame.createDeck();
        testGame.shuffleDeck();
        Stack<Card> basedeck = testGame.getDeck();
        testGame.shuffleDeck();
        assertArrayEquals(basedeck.toArray(), testGame.getDeck().toArray());
  
    }
}

