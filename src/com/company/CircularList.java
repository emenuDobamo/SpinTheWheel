package com.company;

import java.util.ArrayList;
/** First version of a game. Game accepts user input for number of coins,
 *  number of spins, and number of coins to be revealed. Also this version
 *  of the game checks for invalid inputs, and initializes so the game is
 *  ready to play.
 @version
 Fall 2018 v0.3
 @author
 Egor Muscat, Travis Rebhan, Justin Wu, Emenu Dobamo.
 */
public class CircularList<E> extends ArrayList<E> {
    public CircularList(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public E set(int index, E element) {
        return super.set(index % size() , element);
    }

    @Override
    public E get(int index) {
        return super.get(index % size());
    }
}
