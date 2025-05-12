package com.learn.practice.patterns.behavioral.command;

public class StereoOffCommand implements Command {
    private Stereo stereo;
    private boolean wasOn;
    private String prevSource;
    private int prevVolume;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        wasOn = stereo.isOn();
        prevSource = stereo.getSource();
        prevVolume = stereo.getVolume();
        stereo.off();
    }

    @Override
    public void undo() {
        if (wasOn) {
            stereo.on();
            stereo.setSource(prevSource);
            stereo.setVolume(prevVolume);
        }
    }
}
