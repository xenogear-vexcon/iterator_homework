package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected int minVal;
    protected int maxVal;
    protected Random random;

    public Randoms(int min, int max) {
        minVal = min;
        maxVal = max;
        random = new Random();
    }

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt((maxVal - minVal) + 1) + minVal;
            }
        };
    }

}
