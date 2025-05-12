package com.learn.practice.patterns.behavioral.strategy;

import java.util.Arrays;

// Context
public class SortingContext {
    private SortingStrategy strategy;

    public void setSortingStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] array) {
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        long startTime = System.nanoTime();

        strategy.sort(arrayCopy);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000; // microseconds

        System.out.println("Sorted with " + strategy.getName() + " in " + duration + " μs:");
        System.out.println(Arrays.toString(arrayCopy));
    }
}
