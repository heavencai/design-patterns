package com.design.patterns.strategy.behavior.impl;

import com.design.patterns.strategy.behavior.FlyBehavior;

/**
 * 使用火箭动力飞
 */
public class FlyRocketPowered implements FlyBehavior {

    public void fly() {
        System.out.println("I'm flying with a rocket!!");
    }

}
