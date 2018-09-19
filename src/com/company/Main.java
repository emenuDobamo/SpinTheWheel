package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scnr = new Scanner(System.in);


        System.out.println("How many slot in the spinner?");

        Spinner spinner = new Spinner(scnr.nextInt());
        spinner.spin();
        for (int i = 0; i < spinner.slots.size();i++) {

            System.out.println(spinner.slots.get(i)+" ");
        }



    }
}
