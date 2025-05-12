package com.learn.practice.patterns.behavioral.command;

public class LightDimCommand implements Command {
    private Light light;
    private int prevLevel;
    private int level;

    public LightDimCommand(Light light, int level) {
        this.light = light;
        this.level = level;
    }

    @Override
    public void execute() {
        prevLevel = light.getLevel();
        light.dim(level);
    }

    @Override
    public void undo() {
        light.dim(prevLevel);
    }
}
