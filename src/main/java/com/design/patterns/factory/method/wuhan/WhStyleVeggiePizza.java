package com.design.patterns.factory.method.wuhan;

import com.design.patterns.factory.method.base.Pizza;

/**
 * 武汉风味的素食披萨
 */
public class WhStyleVeggiePizza extends Pizza {

    public WhStyleVeggiePizza() {
        name = "武汉风味的素食披萨";
        sauce = "芝麻酱";
        toppings.add("松茸");
        toppings.add("鳄梨");
    }

    @Override
    protected void cut() {
        System.out.println("披萨切为九片，九头鸟的一个头一片...");
    }

}
