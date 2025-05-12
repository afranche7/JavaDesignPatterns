package com.learn.practice.patterns.behavioral.command;

public class Thermostat {
    private String location;
    private int temperature;

    public Thermostat(String location) {
        this.location = location;
        this.temperature = 21; // Default is 21°C
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println(location + " thermostat set to " + temperature + "°C");
    }

    public int getTemperature() {
        return temperature;
    }
}
