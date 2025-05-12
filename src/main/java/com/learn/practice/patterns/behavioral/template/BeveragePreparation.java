package com.learn.practice.patterns.behavioral.template;

// Abstract class with the template method
public abstract class BeveragePreparation {

    // This is the template method
    // It defines the algorithm skeleton
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // These are concrete methods used in the template
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // These methods will be implemented by subclasses
    protected abstract void brew();
    protected abstract void addCondiments();

    // Hook method - can be overridden by subclasses
    protected boolean customerWantsCondiments() {
        return true; // Default implementation
    }
}

