package com.design.patterns.factory.abstracts.wuhan;

import com.design.patterns.factory.abstracts.base.IngredientFactory;
import com.design.patterns.factory.abstracts.base.Pizza;
import com.design.patterns.factory.abstracts.base.PizzaStore;
import com.design.patterns.factory.abstracts.pizza.CheesePizza;
import com.design.patterns.factory.abstracts.pizza.VeggiePizza;
import com.design.patterns.factory.abstracts.wuhan.base.WHIngredientFactory;

/**
 * 武汉披萨店
 */
public class WHPizzaStore extends PizzaStore {

    private IngredientFactory ingredientFactory = new WHIngredientFactory();

    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new CheesePizza(ingredientFactory, "武汉芝士披萨");
        } else if ("veggie".equals(type)) {
            return new VeggiePizza(ingredientFactory, "武汉蔬菜披萨");
        }
        return null;
    }
}
