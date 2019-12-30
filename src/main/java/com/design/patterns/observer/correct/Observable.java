package com.design.patterns.observer.correct;

/**
 * 观察主题
 */
public interface Observable {

    /**
     * 添加观察者
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有观察者
     * @param data
     */
    void notifyObservers(WeatherData data);

}
