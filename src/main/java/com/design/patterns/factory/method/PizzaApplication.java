package com.design.patterns.factory.method;

import com.design.patterns.factory.method.base.PizzaStore;
import com.design.patterns.factory.method.newyork.NyPizzaStore;
import com.design.patterns.factory.method.wuhan.WhPizzaStore;

/**
 * 披萨应用
 */
public class PizzaApplication {

    public static void main(String[] args) {
        // 创建披萨店
        PizzaStore nyStore = new NyPizzaStore();
        PizzaStore whStore = new WhPizzaStore();

        // 点披萨
        nyStore.orderPizza("cheese");
        System.out.println("--------");
        whStore.orderPizza("veggie");
    }

}
