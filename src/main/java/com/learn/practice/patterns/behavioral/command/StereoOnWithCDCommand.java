package com.learn.practice.patterns.behavioral.command;

public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;
    private boolean wasOn;
    private String prevSource;
    private int prevVolume;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        wasOn = stereo.isOn();
        prevSource = stereo.getSource();
        prevVolume = stereo.getVolume();

        stereo.on();
        stereo.setSource("CD");
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        if (!wasOn) {
            stereo.off();
        } else {
            stereo.setSource(prevSource);
            stereo.setVolume(prevVolume);
        }
    }
}
