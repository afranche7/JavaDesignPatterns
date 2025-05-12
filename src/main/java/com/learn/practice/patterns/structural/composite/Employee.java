package com.learn.practice.patterns.structural.composite;

public abstract class Employee {
    protected String name;
    protected String position;
    protected double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public abstract void add(Employee employee);
    public abstract void remove(Employee employee);
    public abstract double calculateTotalSalary();
    public abstract void printOrganizationChart(int level);

    protected String getIndentation(int level) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level; i++) {
            sb.append("  ");
        }
        return sb.toString();
    }
}

