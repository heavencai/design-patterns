package com.design.patterns.observer;

import com.design.patterns.observer.base.Observable;
import com.design.patterns.observer.base.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气主题
 */
public class Weather implements Observable {

    private List<Observer> observers = new ArrayList();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(WeatherData data) {
        for (Observer observer : observers)
            observer.update(data);
    }

}
