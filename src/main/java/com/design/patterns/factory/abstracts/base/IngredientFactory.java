package com.design.patterns.factory.abstracts.base;

/**
 * 原料工厂
 */
public interface IngredientFactory {

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

}
