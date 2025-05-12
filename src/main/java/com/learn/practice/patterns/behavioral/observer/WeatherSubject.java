package com.learn.practice.patterns.behavioral.observer;

// Subject interface
interface WeatherSubject {
    void registerObserver(WeatherObserver observer);

    void removeObserver(WeatherObserver observer);

    void notifyObservers();
}