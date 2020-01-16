package com.design.patterns.command.stereo;

import com.design.patterns.command.base.Command;

/**
 * 关音响命令
 */
public class StereoOffCommand implements Command {

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }

    public void undo() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
