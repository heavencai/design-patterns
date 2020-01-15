package com.design.patterns.factory.abstracts.wuhan.base;

import com.design.patterns.factory.abstracts.base.Cheese;
import com.design.patterns.factory.abstracts.base.IngredientFactory;
import com.design.patterns.factory.abstracts.base.Sauce;
import com.design.patterns.factory.abstracts.base.Veggies;
import com.design.patterns.factory.abstracts.wuhan.WHCheese;
import com.design.patterns.factory.abstracts.wuhan.WHSauce;
import com.design.patterns.factory.abstracts.wuhan.WHVeggies1;
import com.design.patterns.factory.abstracts.wuhan.WHVeggies2;

/**
 * 武汉原料工厂
 */
public class WHIngredientFactory implements IngredientFactory {

    public Sauce createSauce() {
        return new WHSauce();
    }

    public Cheese createCheese() {
        return new WHCheese();
    }

    public Veggies[] createVeggies() {
        Veggies[] veggies = {new WHVeggies1(), new WHVeggies2()};
        return veggies;
    }
}
