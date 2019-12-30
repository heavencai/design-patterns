package com.design.patterns.decorator;

import com.design.patterns.decorator.base.Beverage;

/**
 * 首选咖啡
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return 0.89;
    }
}
