package com.design.patterns.command;

import com.design.patterns.command.base.Command;
import com.design.patterns.command.base.MacroCommand;
import com.design.patterns.command.light.Light;
import com.design.patterns.command.light.LightOffCommand;
import com.design.patterns.command.light.LightOnCommand;
import com.design.patterns.command.stereo.Stereo;
import com.design.patterns.command.stereo.StereoOffCommand;
import com.design.patterns.command.stereo.StereoOnCommand;

/**
 * 遥控器应用
 */
public class RemoteApplication {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // 安装家电
        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo("Living room");

        // 创建命令
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        // 将命令放入遥控器插槽中
        remoteControl.setCommans(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommans(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommans(2, stereoOn, stereoOff);
        System.out.println(remoteControl);

        // 使用遥控器
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();

        // 遥控器一键party
        System.out.println("\n\n遥控器一键party");
        remoteControl = new RemoteControl();
        Command[] partyOn = {livingRoomLightOn, kitchenLightOn, stereoOn};
        Command[] partyOff = {livingRoomLightOff, kitchenLightOff, stereoOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        remoteControl.setCommans(0, partyOnMacro, partyOffMacro);
        System.out.println(remoteControl);

        System.out.println("\nparty on!!!");
        remoteControl.onButtonWasPushed(0);
        System.out.println("\nparty off!!!");
        remoteControl.offButtonWasPushed(0);
        System.out.println("\nundo!!!");
        remoteControl.undoButtonWasPushed();
    }

}
