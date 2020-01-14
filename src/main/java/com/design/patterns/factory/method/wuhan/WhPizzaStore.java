package com.design.patterns.factory.method.wuhan;

import com.design.patterns.factory.method.base.Pizza;
import com.design.patterns.factory.method.base.PizzaStore;

/**
 * 武汉披萨店
 */
public class WhPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new WhStyleCheesePizza();
        } else if ("veggie".equals(type)) {
            return new WhStyleVeggiePizza();
        }
        return null;
    }
}
