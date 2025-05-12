package com.learn.practice.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

// Composite
public class Manager extends Employee {
    private final List<Employee> subordinates = new ArrayList<>();

    public Manager(String name, String position, double salary) {
        super(name, position, salary);
    }

    @Override
    public void add(Employee employee) {
        subordinates.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public double calculateTotalSalary() {
        double totalSalary = salary;
        for (Employee employee : subordinates) {
            totalSalary += employee.calculateTotalSalary();
        }
        return totalSalary;
    }

    @Override
    public void printOrganizationChart(int level) {
        System.out.println(getIndentation(level) + name + " (" + position + ") - $" + salary);
        for (Employee employee : subordinates) {
            employee.printOrganizationChart(level + 1);
        }
    }
}
