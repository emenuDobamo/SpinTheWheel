package com.company;

import java.util.ArrayList;

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
