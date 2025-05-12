package com.learn.practice.patterns.behavioral.command;

// Null Object Command
class NoCommand implements Command {
    @Override
    public void execute() {
        // Do nothing
    }

    @Override
    public void undo() {
        // Do nothing
    }
}
