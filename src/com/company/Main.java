package com.company;
import java.util.Scanner;
public class Main {

    private static Spinner spinner;

    public static void main(String[] args) {



        System.out.println("Enter number of coin: ");
        Scanner scnr = new Scanner(System.in);
        int numOfCoins =scnr.nextInt();
        System.out.println("Input accepted for number of coins: "+numOfCoins);

        System.out.println("\nEnter the number of coins to reveal");
        int numToreveal = scnr.nextInt();
        System.out.println("Input accepted for number of coins: "+numToreveal);


        System.out.println("\nEnter the number spin:");
        int numOfSpin = scnr.nextInt();
        System.out.println("Input accepted for number of coins: "+numToreveal);


        spinner = new Spinner(numOfCoins);
        System.out.println("initialization complete, ready for the spin");



        spinner.spin(numOfCoins,numToreveal);
        spinner.show();
    }
}
