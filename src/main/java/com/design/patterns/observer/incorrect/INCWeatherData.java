package com.design.patterns.observer.incorrect;

/**
 * 天气数据
 */
public class INCWeatherData {

    // 温度
    private float temperature;
    // 湿度
    private float humidity;
    // 气压
    private float pressure;

    public INCWeatherData(){

    }

    public INCWeatherData(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    /**
     * 数据变化
     */
    public void measurmentsChanged(){
        new INCCurrentConditionDisply().update(temperature, humidity, pressure);
        new INCStaisticsDisply().update(temperature, humidity, pressure);
        new INCForcastDisply().update(temperature, humidity, pressure);
    }

}
