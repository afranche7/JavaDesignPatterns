package com.learn.practice.patterns.behavioral.strategy;


import java.util.Arrays;

// Strategy Interface
interface SortingStrategy {
    void sort(int[] array);

    String getName();
}
