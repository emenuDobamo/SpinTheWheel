package com.company;

public class Spinner {
     /**
     * Constructor
     * initializes the circularList with input form user
     *
     */
    public Spinner (int numOfCoins){
        CircularList<Coin> coins = new CircularList<>(numOfCoins);
        System.out.println("Initializing the game with random coins...");
        for (int i = 0; i < numOfCoins; i++){
            coins.add(i,new Coin());
        }
        // tests how many and what coins were generated. Will be removed before submission
        // or should it stay ?
        for (int i=0; i<= coins.size(); i++){
            System.out.println("coin index number " +i+": "+coins.get(i).getSide());
        }
        System.out.println("initialization complete, ready for the spin");
    }
}
