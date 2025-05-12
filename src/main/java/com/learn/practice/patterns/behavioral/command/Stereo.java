package com.learn.practice.patterns.behavioral.command;

public class Stereo {
    private String location;
    private boolean isOn;
    private String source;
    private int volume;

    public Stereo(String location) {
        this.location = location;
        this.isOn = false;
        this.source = "CD";
        this.volume = 5;
    }

    public void on() {
        isOn = true;
        System.out.println(location + " stereo is on");
    }

    public void off() {
        isOn = false;
        System.out.println(location + " stereo is off");
    }

    public void setSource(String source) {
        this.source = source;
        System.out.println(location + " stereo source set to " + source);
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(location + " stereo volume set to " + volume);
    }

    public boolean isOn() {
        return isOn;
    }

    public String getSource() {
        return source;
    }

    public int getVolume() {
        return volume;
    }
}
