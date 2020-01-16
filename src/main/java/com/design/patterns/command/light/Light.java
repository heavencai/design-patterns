package com.design.patterns.command.light;

/**
 * 电灯
 */
public class Light {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Light on");
    }

    public void off() {
        System.out.println(name + "Light off");
    }

}
