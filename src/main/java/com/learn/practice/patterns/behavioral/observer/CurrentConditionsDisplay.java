package com.learn.practice.patterns.behavioral.observer;

// Concrete Observer 1
public class CurrentConditionsDisplay implements WeatherObserver {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Current Conditions: " + temperature +
                "°C, " + humidity + "% humidity");
    }
}
