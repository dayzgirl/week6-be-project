package vergne.daisy;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//Player properties - cards, score, and name
    private List<Card> hand;
    private int score;
    private String name;
    
    // Constructor - Creates new player
    public Player(String name) {
        this.hand = new ArrayList<Card>();
        this.score = 0;
        this.name = name;
    }
    
    //Shows all cards in the player's hand
    public void describe() {
        System.out.println("\n" + this.name + "'s hand:");
        for (Card card : this.hand) {
            card.describe();
        }
    }
   
    //Flips a player's "top" card 
    public Card flip() {
        return this.hand.remove(0);
    }
    
    //Draws a card from the deck and adds it to the player's hand
    public void draw(Deck deck) {
        Card card = deck.draw();
        if (card != null) {
            this.hand.add(card);
        }
    }
    
    //Increases player's score when they have a winning had
    public void incrementScore() {
        this.score++;
    }
    
    //Gets a player's score
    public int getScore() {
        return this.score;
    }
    
    //Gets the player's name
    public String getName() {
        return this.name;
    }
}