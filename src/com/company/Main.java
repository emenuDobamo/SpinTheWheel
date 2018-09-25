package com.company;
import java.util.Scanner;
/** First version of a game. Game accepts user input for number of coins,
 *  number of spins, and number of coins to be revealed. Also this version
 *  of the game checks for invalid inputs, and initializes so the game is
 *  ready to play.
 @version
 Fall 2018 v0.3
 @author
 Egor Muscat, Travis Rebhan, Justin Wu, Emenu Dobamo.
 */
public class Main {
    /**
     * Accepts user inputs and creates a Spinner object using one of the inputs
     */
    public static void main(String[] args) {
        int numOfCoins, numToReveal, numOfSpin;

        System.out.print("Enter number of coin: ");
        Scanner scnr = new Scanner(System.in);
        numOfCoins = scnr.nextInt();
        // checking for the invalid input
        if (numOfCoins < 0){
            System.out.println("Invalid Input!");
            System.exit(0);
        }
        else {
            System.out.println("Input accepted for number of coins: "+numOfCoins);
        }

        System.out.print("\nEnter the number of coins to reveal: ");
        numToReveal = scnr.nextInt();
        // checking for the invalid input
        if (numToReveal < 0 || numToReveal > numOfCoins){
            System.out.println("Invalid Input!");
            System.exit(0);
        }
        else {
            System.out.println("Input accepted for number of coins to reveal: "+numToReveal);
        }

        System.out.print("\nEnter the number spin: ");
        numOfSpin = scnr.nextInt();
        // checking for the invalid input
        if (numOfSpin < 0){
            System.out.println("Invalid Input!");
            System.exit(0);
        }
        else {
            System.out.println("Input accepted for number of spin: " + numOfSpin+"\n");
        }

        // Creates a spinner object
        Spinner spinner = new Spinner(numOfCoins);
    }
}
