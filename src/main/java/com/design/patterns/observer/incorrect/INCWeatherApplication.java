package com.design.patterns.observer.incorrect;

/**
 * 气象站
 * 1、我们是针对实现编程，而非针对接口。
 *
 * 2、对于每个新的布告板，我们都得修改代码。
 *
 * 3、无法在运行时动态地增加或者删除布告板。
 *
 * 4、未封装改变的部分，违反了对修改关闭，对扩展开放原则。
 */
public class INCWeatherApplication {

    public static void main(String[] args) {
        new INCWeatherData(12, 37, 1024).measurmentsChanged();
        new INCWeatherData(10, 30, 1022).measurmentsChanged();
    }

}
