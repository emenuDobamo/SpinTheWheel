package com.company;

import java.util.Random;

public class Coin {

    private enum typeOfSide {HEAD, TAIL}
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

    // dont need set yet but I guess we can keep it as part of "get, set"
    public  void setSide(typeOfSide side){
        this.side = side;
    }
    public  typeOfSide getSide(){
        return side;
    }
}
