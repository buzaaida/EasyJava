package com.company;

import java.util.Iterator;

public class MyColl implements Iterable<Object> {
    String[] cars={"BMW", "Audi", "Mercedes"};
    int current=0;
    @Override
    public Iterator<Object> iterator() {
        return new Iterator<Object>() {
            @Override
            public boolean hasNext() {
                return current<cars.length;
            }

            @Override
            public Object next() {
                return cars[current++];
            }
        };
    }
}
