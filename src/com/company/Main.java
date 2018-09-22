package com.company;
import java.util.Scanner;
public class Main {

    private static Spinner spinner;

    public static void main(String[] args) {



        System.out.println("Enter number of coin: ");
        Scanner scnr = new Scanner(System.in);
        int numOfCoins =scnr.nextInt();
        spinner = new Spinner(numOfCoins);
        int numToreveal = scnr.nextInt();
        spinner.spin(numOfCoins,numToreveal);

        spinner.show();
    }
}
