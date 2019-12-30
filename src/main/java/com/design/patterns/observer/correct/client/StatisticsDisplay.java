package com.design.patterns.observer.correct.client;

import com.design.patterns.observer.correct.DisplayElement;
import com.design.patterns.observer.correct.Observer;
import com.design.patterns.observer.correct.WeatherData;

/**
 * 天气统计
 */
public class StatisticsDisplay implements DisplayElement, Observer {

    private Float average;
    private Float highest;
    private Float lowest;

    public void display() {
        System.out.println("天气统计：" +
                "平均温度(℉)：" + average + " " +
                "最高温度(℉)：" + highest + " " +
                "最低温度(℉)：" + lowest);
    }

    public void update(WeatherData data) {
        float temperature = data.getTemperature();
        average = null == average ? temperature :
                (average + temperature) / 2;
        highest = null == highest ? temperature :
                (highest > temperature ? highest : temperature);
        lowest = null == lowest ? temperature :
                (lowest > temperature ? temperature : lowest);
        display();
    }

}
