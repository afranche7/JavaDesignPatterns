package com.learn.practice.patterns.structural.composite;

// Another Leaf
public class Designer extends Employee {
    public Designer(String name, double salary) {
        super(name, "Designer", salary);
    }

    @Override
    public void add(Employee employee) {
        System.out.println("Cannot add to a designer");
    }

    @Override
    public void remove(Employee employee) {
        System.out.println("Cannot remove from a designer");
    }

    @Override
    public double calculateTotalSalary() {
        return salary;
    }

    @Override
    public void printOrganizationChart(int level) {
        System.out.println(getIndentation(level) + name + " (" + position + ") - $" + salary);
    }
}
