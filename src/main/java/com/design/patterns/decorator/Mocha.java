package com.design.patterns.decorator;

import com.design.patterns.decorator.base.Beverage;
import com.design.patterns.decorator.base.CondimentDecorator;

/**
 * 摩卡
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return 0.20 + beverage.cost();
    }
}
