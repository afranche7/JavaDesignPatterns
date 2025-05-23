package com.learn.practice.patterns.behavioral.command;

import java.util.Stack;

// Invoker
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Stack<Command> undoStack;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoStack = new Stack<>();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoStack.push(onCommands[slot]);
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoStack.push(offCommands[slot]);
    }

    public void undoButtonWasPushed() {
        if (!undoStack.isEmpty()) {
            Command command = undoStack.pop();
            command.undo();
        } else {
            System.out.println("No commands to undo");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[slot " + i + "] " + onCommands[i].getClass().getSimpleName() + "    "
                    + offCommands[i].getClass().getSimpleName() + "\n");
        }
        sb.append("[undo] Most recent command\n");
        return sb.toString();
    }
}
