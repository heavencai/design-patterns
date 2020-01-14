package com.design.patterns.factory.method.wuhan;

import com.design.patterns.factory.method.base.Pizza;

/**
 * 武汉风味的芝士披萨
 */
public class WhStyleCheesePizza extends Pizza {

    public WhStyleCheesePizza() {
        name = "武汉风味的芝士披萨";
        sauce = "芝麻酱";
        toppings.add("鸭脖");
        toppings.add("豆皮");
    }

    @Override
    protected void cut() {
        System.out.println("披萨切为九片，九头鸟的一个头一片...");
    }
}
