package com.design.patterns.decorator;

import com.design.patterns.decorator.base.Beverage;

/**
 * 咖啡应用
 *
 * LineNumberInputStream也是一个具体的“装饰者”，它加上了计算行数的能力。
 *
 * BufferedInputStream是一个具体的“装饰者”，它加入两种行为:利用缓冲输入来改进性能；用一个readLine()方法(用来一次读取一行文本输入数据)来增强接口。
 *
 * FileInpuStream是被装饰的“组件”。Java I/O程序库提供了几个组件，包括了FileInputStream、StringBufferInputStream、ByteArrayInputStream...等。这些类都提供了最基本的字节读取功能。
 */
public class CaffeApplication {

    public static void main(String args[]) {
        // 一辈意式浓缩，不需要调􏱆
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // 一杯首选，加豆浆、摩卡、奶泡
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }

}
