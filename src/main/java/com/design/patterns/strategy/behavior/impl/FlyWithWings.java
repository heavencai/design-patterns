package com.design.patterns.strategy.behavior.impl;

import com.design.patterns.strategy.behavior.FlyBehavior;

/**
 * 用翅膀飞
 */
public class FlyWithWings implements FlyBehavior {

    public void fly() {
        System.out.println("I'm flying!!");
    }

}
