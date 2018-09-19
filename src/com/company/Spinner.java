package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Spinner {
    ArrayList<String> slots;
    Coin coin;
    public int NumberOfSlots;

    //Constructor
    public Spinner(int numSlot){
        this.NumberOfSlots = numSlot;
        slots = new ArrayList<>(numSlot);
    }

    //Spins the wheel
    public int spin(){

        for (int i = 0; i < 10; i++){
            coin = new Coin();
            slots.add(i,coin.getSide());

        }
        return slots.size() ;
    }

    //get the value of ea
}
