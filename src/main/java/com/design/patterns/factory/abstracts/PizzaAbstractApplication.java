package com.design.patterns.factory.abstracts;

import com.design.patterns.factory.abstracts.base.PizzaStore;
import com.design.patterns.factory.abstracts.newyork.NYPizzaStore;
import com.design.patterns.factory.abstracts.wuhan.WHPizzaStore;

/**
 * 披萨应用
 */
public class PizzaAbstractApplication {

    public static void main(String[] args) {
        // 创建披萨店
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore whStore = new WHPizzaStore();

        // 点披萨
        nyStore.orderPizza("cheese");
        System.out.println("--------");
        whStore.orderPizza("veggie");
    }

}
