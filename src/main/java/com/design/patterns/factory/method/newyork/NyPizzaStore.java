package com.design.patterns.factory.method.newyork;

import com.design.patterns.factory.method.base.Pizza;
import com.design.patterns.factory.method.base.PizzaStore;

/**
 * 纽约披萨店
 */
public class NyPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NyStyleCheesePizza();
        } else if ("veggie".equals(type)) {
            return new NyStyleVeggiePizza();
        }
        return null;
    }
}
