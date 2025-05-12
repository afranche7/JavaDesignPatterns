package com.learn.practice.patterns.structural.adapter.object;

// Target interface our application expects
public interface MediaPlayer {
    void play(String filename);

    void setVolume(int level);
}

