package com.learn.practice.patterns.creational.dependencyinjection;

public class Logger {

    public Logger(String name) {

    }

    public void log(String input) {
        System.out.println("Logging Input: " + input);
    }
}
