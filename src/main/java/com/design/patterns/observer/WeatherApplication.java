package com.design.patterns.observer;

import com.design.patterns.observer.base.Observable;
import com.design.patterns.observer.base.Observer;
import com.design.patterns.observer.client.CurrentConditionsDisplay;
import com.design.patterns.observer.client.ForecastDisplay;
import com.design.patterns.observer.client.StatisticsDisplay;

/**
 * 气象站
 *
 * 观察者引申的设计原则：为了交互对象之间的松耦合设计而努力
 *
 * jdk内置观察者
 * java.util.Observer
 * java.util.Observable
 * Observable不是接口，不能多继承、限制复用
 * Observable.setChanged为protected，必须继承该类，违反多用组合、少用继承的原则
 *
 * 主题只知道观察者实现了某个接口（也就是Observer接口）。
 * 主题不需要知道观察者的具体类是谁、做了些什么或其他任何细节。
 * 任何时候我们都可以增加新的观察者，因为主题唯一依赖的东西是一个实现Observer接口的对象列表，所以我们可以随时增加观察者。
 */
public class WeatherApplication {

    public static void main(String[] args) {
        Observable observable = new Weather();
        Observer currentCondition = new CurrentConditionsDisplay(observable);
        Observer statistics = new StatisticsDisplay();
        Observer forecast = new ForecastDisplay();

        observable.addObserver(currentCondition);
        observable.addObserver(statistics);
        observable.addObserver(forecast);

        observable.notifyObservers(new WeatherData(80, 65, 30.4f));
        observable.notifyObservers(new WeatherData(82, 70, 29.2f));
        observable.notifyObservers(new WeatherData(78, 90, 25.1f));
    }

}
