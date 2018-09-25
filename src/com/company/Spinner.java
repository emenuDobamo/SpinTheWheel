package com.company;
/** First version of a game. Game accepts user input for number of coins,
 *  number of spins, and number of coins to be revealed. Also this version
 *  of the game checks for invalid inputs, and initializes so the game is
 *  ready to play.
 @version
 Fall 2018 v0.3
 @author
 Egor Muscat, Travis Rebhan, Justin Wu, Emenu Dobamo.
 */
public class Spinner {
     /**
      * Constructs a spinner object which initializes CircularList with the
      * number of coins provided by the user input
      */
    public Spinner (int numOfCoins){
        CircularList<Coin> coins = new CircularList<>(numOfCoins);
        System.out.println("Initializing the game with random coins...");
        for (int i = 0; i < numOfCoins; i++){
            coins.add(i,new Coin());
        }
        // tests how many and what coins were generated. Will be removed before submission
        // or should it stay ?
        for (int i=0; i<coins.size(); i++){
            System.out.println("coin index number " +i+": "+coins.get(i).getSide());
        }
        System.out.println("initialization complete, ready for the spin");
    }
}
