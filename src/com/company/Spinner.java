package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Spinner {

    //a circular array contains list of coins
    private CircularList<Coin> coins;
    private ArrayList<Boolean> visible;
    private Double rand ;


    //initializes the circularList with input form user
    public Spinner (int numOfCoins){
        coins = new CircularList<>(numOfCoins);
        for (int i = 0; i < numOfCoins; i++){
            coins.add(i,new Coin());

        }

    }

    //spin the will as many time as possible and reveals
    public void spin(int numOfCoins, int numToReveal){
        for (int i = 0; i < numToReveal; i ++) {
            visible.add( new Random().nextInt(numToReveal), true);
        }

    }


    public void show(){

        for (int i = 0; i < coins.size(); i++){
            System.out.print(coins.get(i));
        }
    }
    }
