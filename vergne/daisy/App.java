package vergne.daisy;

public class App {
    public static void main(String[] args) {
        // Starts the game. New deck and players
        Deck deck = new Deck();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        
        // Shuffles the deck
        deck.shuffle();
        
        // Deals the cards to the players
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }
        
        // Shows the playing of the game
        System.out.println("Let the game begin!\n");
        for (int i = 0; i < 26; i++) {
            System.out.println("Round " + (i + 1) + ":");
            Card card1 = player1.flip();
            Card card2 = player2.flip();
            
            System.out.println("Player 1 plays: " + card1.getName());
            System.out.println("Player 2 plays: " + card2.getName());
            
            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println("Player 1 wins this round!");
            } else if (card2.getValue() > card1.getValue()) {
                player2.incrementScore();
                System.out.println("Player 2 wins this round!");
            } else {
                System.out.println("It's a tie! No points awarded.");
            }
            
            System.out.println("Current scores - Player 1: " + player1.getScore() 
                             + ", Player 2: " + player2.getScore() + "\n");
        }
        
        // Uses all game play information to determine and announce winner
        System.out.println("\nGame Over!");
        System.out.println("Final Scores:");
        System.out.println("Player 1: " + player1.getScore());
        System.out.println("Player 2: " + player2.getScore());
        
        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player 1 wins!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}