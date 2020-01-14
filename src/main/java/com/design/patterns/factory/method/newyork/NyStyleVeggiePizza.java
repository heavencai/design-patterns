package com.design.patterns.factory.method.newyork;

import com.design.patterns.factory.method.base.Pizza;

/**
 * 纽约风味的素食披萨
 */
public class NyStyleVeggiePizza extends Pizza {

    public NyStyleVeggiePizza() {
        name = "纽约风味的素食披萨";
        sauce = "沙拉酱";
        toppings.add("蓝莓");
        toppings.add("芦笋");
    }

}
