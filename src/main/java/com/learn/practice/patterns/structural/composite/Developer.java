package com.learn.practice.patterns.structural.composite;

// Leaf
public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, "Developer", salary);
    }

    @Override
    public void add(Employee employee) {
        System.out.println("Cannot add to a developer");
    }

    @Override
    public void remove(Employee employee) {
        System.out.println("Cannot remove from a developer");
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
