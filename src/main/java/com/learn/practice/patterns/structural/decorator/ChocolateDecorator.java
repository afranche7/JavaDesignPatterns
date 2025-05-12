package com.learn.practice.patterns.structural.decorator;

public class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Chocolate";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.6;
    }
}
