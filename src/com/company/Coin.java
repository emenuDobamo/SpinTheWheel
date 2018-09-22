package com.company;

import java.util.Random;

public class Coin {

    private enum typeOfSide {HEAD, TAIL;};
    private typeOfSide side;


    //constructor
    public Coin (){
      Random  rnd = new Random();
      double random = rnd.nextDouble();
      if (random > 0.5){
          side = typeOfSide.HEAD;
      }
      else {
          side = typeOfSide.TAIL;
      }

    }



    public   void flip(){

        if(side == typeOfSide.HEAD){
            side = typeOfSide.TAIL;
        }
        else {
            side = typeOfSide.HEAD;
        }

    }
    public  void setSide(typeOfSide side){

        this.side = side;
    }
    public  typeOfSide getSide(){

        return side;
    }

}
