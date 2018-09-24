package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int numOfCoins, numToReveal, numOfSpin;

        System.out.print("Enter number of coin: ");
        Scanner scnr = new Scanner(System.in);
        numOfCoins = scnr.nextInt();

        if (numOfCoins < 0){
            System.out.println("Invalid Input!");
            System.exit(0);
        }
        else {
            System.out.println("Input accepted for number of coins: "+numOfCoins);
        }

        System.out.print("\nEnter the number of coins to reveal: ");
        numToReveal = scnr.nextInt();

        if (numToReveal < 0 || numToReveal > numOfCoins){
            System.out.println("Invalid Input!");
            System.exit(0);
        }
        else {
            System.out.println("Input accepted for number of coins to reveal: "+numToReveal);
        }

        System.out.print("\nEnter the number spin: ");
        numOfSpin = scnr.nextInt();

        if (numOfSpin < 0){
            System.out.println("Invalid Input!");
            System.exit(0);
        }
        else {
            System.out.println("Input accepted for number of spin: " + numOfSpin+"\n");
        }

        /**
         * Intialize the game.
         */
        Spinner spinner = new Spinner(numOfCoins);
    }
}
