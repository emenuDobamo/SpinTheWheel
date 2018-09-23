package com.company;


import java.util.ArrayList;
import java.util.Random;

public class Spinner {

    //a circular array contains list of coins
    private CircularList<Coin> coins;
    private ArrayList<Boolean> visible;
    private Double rand ;

    /**
     * Constructor
     * initializes the circularList with input form user

     *
     */
    public Spinner (int numOfCoins){
        coins = new CircularList<>(numOfCoins);
        for (int i = 0; i < numOfCoins; i++){
            coins.add(i,new Coin());

        }

    }

    /**
     *
     *
     * @param  numOfCoins  an absolute URL giving the base location of the image
     * @param  numToReveal the location of the image, relative to the url argument
     */

    public void spin(int numOfCoins, int numToReveal){
        visible = new ArrayList<>(numOfCoins);

        for (int i = 0; i < numToReveal; i ++) {
            visible.add( new Random().nextInt(numToReveal), true);
        }

    }


    public void show(){

        for (int i = 0; i <= coins.size(); i++){
            System.out.println(coins.get(0)+" ");
        }
    }
    }
