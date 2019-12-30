package com.design.patterns.decorator;

import com.design.patterns.decorator.base.Beverage;
import com.design.patterns.decorator.base.CondimentDecorator;

/**
 * 豆浆
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return 0.10 + beverage.cost();
    }
}
