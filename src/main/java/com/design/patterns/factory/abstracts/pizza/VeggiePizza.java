package com.design.patterns.factory.abstracts.pizza;

import com.design.patterns.factory.abstracts.base.IngredientFactory;
import com.design.patterns.factory.abstracts.base.Pizza;
import com.design.patterns.factory.abstracts.base.Veggies;

/**
 * 蔬菜披萨
 */
public class VeggiePizza extends Pizza {

    // 原料工厂
    private IngredientFactory ingredientFactory;

    public VeggiePizza(IngredientFactory ingredientFactory, String name) {
        this.ingredientFactory = ingredientFactory;
        super.name = name;
    }

    public void prepare() {
        System.out.println("准备披萨: " + name);
        System.out.println("放入酱料: " + ingredientFactory.createSauce().getClass().getName());
        Veggies[] veggies = ingredientFactory.createVeggies();
        for (Veggies v : veggies) {
            System.out.println("放入蔬菜: " + v.getClass().getName());
        }
        System.out.println("放入芝士: " + ingredientFactory.createCheese().getClass().getName());
    }
}
