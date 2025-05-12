package com.learn.practice.patterns.behavioral.template;

// Concrete implementation - Coffee
public class CoffeeMaker extends BeveragePreparation {
    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
