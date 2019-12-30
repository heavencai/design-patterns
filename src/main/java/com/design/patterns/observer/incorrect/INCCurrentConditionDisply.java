package com.design.patterns.observer.incorrect;

/**
 * 目前天气状况
 */
public class INCCurrentConditionDisply {

    public void update(float temperature,float humidity,float Pressure){
        System.out.println("目前天气状况");
    }

}
