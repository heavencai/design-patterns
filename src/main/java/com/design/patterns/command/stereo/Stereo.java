package com.design.patterns.command.stereo;

/**
 * 音响
 */
public class Stereo {

    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Stereo on");
    }

    public void off() {
        System.out.println(name + " Stereo off");
    }

    public void setCd() {
        System.out.println(name + " Stereo setCd");
    }

    public void setDvd() {
        System.out.println(name + " Stereo setDvd");
    }

    public void setRadio() {
        System.out.println(name + " Stereo setRadio");
    }

    public void setVolume(int volume) {
        System.out.println(name + " Stereo setVolume: " + volume);
    }

}
