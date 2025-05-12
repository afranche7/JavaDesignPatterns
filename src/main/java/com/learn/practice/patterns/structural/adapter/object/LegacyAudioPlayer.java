package com.learn.practice.patterns.structural.adapter.object;

// Adaptee - the legacy audio player with different interface
public class LegacyAudioPlayer {
    public void playAudio(String audioFile) {
        System.out.println("Playing audio file: " + audioFile);
    }

    public void adjustVolume(int percentage) {
        System.out.println("Adjusting volume to " + percentage + "%");
    }
}
