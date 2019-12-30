package com.design.patterns.observer.correct.client;

import com.design.patterns.observer.correct.DisplayElement;
import com.design.patterns.observer.correct.Observer;
import com.design.patterns.observer.correct.WeatherData;

/**
 * 天气预报
 */
public class ForecastDisplay implements DisplayElement, Observer {

    private float pressure;

    public void update(WeatherData data) {
        pressure = data.getPressure();
        display();
    }

    public void display() {
        System.out.println("天气预测：" + forecast());
    }

    private static final float INFRABAR = 28.5f;//气压低就会下雨

    private String forecast(){
        return INFRABAR < pressure ? "明天不下雨" : "明天要下雨";
    }

}
