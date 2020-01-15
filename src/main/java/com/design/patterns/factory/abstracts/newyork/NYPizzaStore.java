package com.design.patterns.factory.abstracts.newyork;

import com.design.patterns.factory.abstracts.base.IngredientFactory;
import com.design.patterns.factory.abstracts.base.Pizza;
import com.design.patterns.factory.abstracts.base.PizzaStore;
import com.design.patterns.factory.abstracts.newyork.base.NYIngredientFactory;
import com.design.patterns.factory.abstracts.pizza.CheesePizza;
import com.design.patterns.factory.abstracts.pizza.VeggiePizza;

/**
 * 纽约披萨店
 */
public class NYPizzaStore extends PizzaStore {

    private IngredientFactory ingredientFactory = new NYIngredientFactory();

    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new CheesePizza(ingredientFactory, "纽约芝士披萨");
        } else if ("veggie".equals(type)) {
            return new VeggiePizza(ingredientFactory, "纽约蔬菜披萨");
        }
        return null;
    }
}
