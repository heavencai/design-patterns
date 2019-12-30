package com.design.patterns.observer.correct;

/**
 * 观察者
 */
public interface Observer {

    /**
     * 更新
     * @param data
     */
    void update(WeatherData data);;

}
