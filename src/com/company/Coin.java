package com.company;
import java.util.Random;
/** First version of a game. Game accepts user input for number of coins,
 *  number of spins, and number of coins to be revealed. Also this version
 *  of the game checks for invalid inputs, and initializes so the game is
 *  ready to play.
 @version
 Fall 2018 v0.3
 @author
 Egor Muscat, Travis Rebhan, Justin Wu, Emenu Dobamo.
 */
public class Coin {

    private enum typeOfSide {HEAD, TAIL}
    private typeOfSide side;

    /**
     * Constructs a Coin object using random number between 0.0 and 0.9
     * where 0.0-0.4 assigns TAIL, and if the random value is from 0.5-0.9
     * then it assigns HEAD.
     */
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

    /**
     * This method not used in this version.
     */
    // dont need set yet but I guess we can keep it as part of "get, set"
    public  void setSide(typeOfSide side){
        this.side = side;
    }

    /**
     * Accesses the coin to see what side it is
     * @return HEADS or TAILS.
     */
    public  typeOfSide getSide(){
        return side;
    }
}
