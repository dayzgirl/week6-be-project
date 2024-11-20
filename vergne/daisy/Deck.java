package vergne.daisy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//Stores card collection
    private List<Card> cards;
    
    // Constructor - Creates and populates a new deck
    public Deck() {
        this.cards = new ArrayList<Card>();
        
        //Card properties
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", 
                          "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        
        //Creates all 52 cards iterating through each suit and number with a starting value of 2
        for (String suit : suits) {
            int value = 2;
            for (String number : numbers) {
                cards.add(new Card(value, number + " of " + suit));
                value++;
            }
        }
    }
    
    //Randomizes cards
    public void shuffle() {
        Collections.shuffle(this.cards);
    }
    
    //Removes and returns top card from deck
    public Card draw() {
        if (this.cards.isEmpty()) {
            return null;
        }
        return this.cards.remove(0);
    }
}