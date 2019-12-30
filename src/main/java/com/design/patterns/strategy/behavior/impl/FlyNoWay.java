package com.design.patterns.strategy.behavior.impl;

import com.design.patterns.strategy.behavior.FlyBehavior;

/**
 * 不会飞
 */
public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("I can't fly..");
    }

}
