package com.design.patterns.strategy.behavior.impl;

import com.design.patterns.strategy.behavior.QuackBehavior;

/**
 * 呱呱叫
 */
public class Quack implements QuackBehavior {

    public void quack() {
        System.out.println("呱呱。。");
    }

}
