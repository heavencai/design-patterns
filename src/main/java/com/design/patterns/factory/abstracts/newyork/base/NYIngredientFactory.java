package com.design.patterns.factory.abstracts.newyork.base;

import com.design.patterns.factory.abstracts.base.Cheese;
import com.design.patterns.factory.abstracts.base.IngredientFactory;
import com.design.patterns.factory.abstracts.base.Sauce;
import com.design.patterns.factory.abstracts.base.Veggies;
import com.design.patterns.factory.abstracts.newyork.NYCheese;
import com.design.patterns.factory.abstracts.newyork.NYSauce;
import com.design.patterns.factory.abstracts.newyork.NYVeggies1;
import com.design.patterns.factory.abstracts.newyork.NYVeggies2;

/**
 * 纽约原料工厂
 */
public class NYIngredientFactory implements IngredientFactory {

    public Sauce createSauce() {
        return new NYSauce();
    }

    public Cheese createCheese() {
        return new NYCheese();
    }

    public Veggies[] createVeggies() {
        Veggies[] veggies = {new NYVeggies1(), new NYVeggies2()};
        return veggies;
    }
}
