package com.learn.practice.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// Observer interface
interface WeatherObserver {
    void update(float temperature, float humidity, float pressure);
}