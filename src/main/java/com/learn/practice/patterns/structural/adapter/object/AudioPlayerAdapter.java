package com.learn.practice.patterns.structural.adapter.object;

// Adapter - makes LegacyAudioPlayer compatible with MediaPlayer
public class AudioPlayerAdapter implements MediaPlayer {
    private LegacyAudioPlayer legacyPlayer;

    public AudioPlayerAdapter(LegacyAudioPlayer legacyPlayer) {
        this.legacyPlayer = legacyPlayer;
    }

    @Override
    public void play(String filename) {
        // Convert the call to the legacy method
        legacyPlayer.playAudio(filename);
    }

    @Override
    public void setVolume(int level) {
        // Map volume level to percentage
        legacyPlayer.adjustVolume(level);
    }
}
