package com.design.patterns.command;

import com.design.patterns.command.base.Command;
import com.design.patterns.command.base.NoCommand;

/**
 * 遥控器
 */
public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[3];
        offCommands = new Command[3];
        Command noCommand = new NoCommand();
        for (int i=0; i<3; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommans(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n----RemoteControl---\n");
        for (int i=0; i<onCommands.length; i++) {
            buffer.append("[slot"+i+"] " + onCommands[i].getClass().getName() + " " + offCommands[i].getClass().getName() + "\n");
        }
        return buffer.toString();
    }

}
