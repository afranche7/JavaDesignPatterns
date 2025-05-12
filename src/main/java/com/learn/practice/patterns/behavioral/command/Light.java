package com.learn.practice.patterns.behavioral.command;

// Receivers
public class Light {
    private String location;
    private int level;

    public Light(String location) {
        this.location = location;
        this.level = 0;
    }

    public void on() {
        level = 100;
        System.out.println(location + " light is on");
    }

    public void off() {
        level = 0;
        System.out.println(location + " light is off");
    }

    public void dim(int level) {
        this.level = level;
        if (level == 0) {
            off();
        } else {
            System.out.println(location + " light is dimmed to " + level + "%");
        }
    }

    public int getLevel() {
        return level;
    }
}
