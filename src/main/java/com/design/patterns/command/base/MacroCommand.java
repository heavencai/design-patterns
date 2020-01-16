package com.design.patterns.command.base;

/**
 * 宏命令
 */
public class MacroCommand implements Command {

    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for (Command c : commands) {
            c.execute();
        }
    }

    public void undo() {
        for (Command c : commands) {
            c.undo();
        }
    }
}
