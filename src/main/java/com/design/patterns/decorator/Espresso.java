package com.design.patterns.decorator;

import com.design.patterns.decorator.base.Beverage;

/**
 * 意式浓缩
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
