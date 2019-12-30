package com.design.patterns.observer.client;

import com.design.patterns.observer.base.DisplayElement;
import com.design.patterns.observer.base.Observable;
import com.design.patterns.observer.base.Observer;
import com.design.patterns.observer.WeatherData;

/**
 * 当前天气状况
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {

    Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
    }

    WeatherData data = new WeatherData();

    public void display() {
        System.out.println("当前的天气状况： " +
                "温度(℉)：" + data.getTemperature() + " " +
                "湿度：" + data.getHumidity() + " " +
                "气压：" + data.getPressure());
    }

    public void update(WeatherData data) {
        this.data = data;
        display();
    }

}
