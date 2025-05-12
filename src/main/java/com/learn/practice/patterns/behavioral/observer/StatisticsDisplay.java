package com.learn.practice.patterns.behavioral.observer;

// Concrete Observer 2
public class StatisticsDisplay implements WeatherObserver {
    private float maxTemp = 0.0f;
    private float minTemp = 200.0f;
    private float tempSum = 0.0f;
    private int numReadings = 0;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        numReadings++;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }

        System.out.println("Statistics: Avg/Max/Min temperature = " +
                (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}
