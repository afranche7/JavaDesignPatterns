package com.learn.practice.patterns.structural.adapter.object;

// Modern media application
public class MediaApplication {
    private MediaPlayer player;

    public MediaApplication(MediaPlayer player) {
        this.player = player;
    }

    public void playMedia(String filename) {
        player.play(filename);
        player.setVolume(70);
        // ... more operations
    }
}
