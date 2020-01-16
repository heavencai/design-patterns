package com.design.patterns.command.light;

import com.design.patterns.command.base.Command;

/**
 * 关灯命令
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
