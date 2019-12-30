package com.design.patterns.observer.base;

import com.design.patterns.observer.WeatherData;

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
