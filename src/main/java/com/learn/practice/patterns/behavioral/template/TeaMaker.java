package com.learn.practice.patterns.behavioral.template;

// Concrete implementation - Tea
public class TeaMaker extends BeveragePreparation {
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    protected boolean customerWantsCondiments() {
        // Let's say tea drinkers don't always want lemon
        return false;
    }
}
