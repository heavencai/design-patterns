package com.design.patterns.command.light;

import com.design.patterns.command.base.Command;

/**
 * 开灯命令
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
