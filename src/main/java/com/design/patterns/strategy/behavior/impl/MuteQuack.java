package com.design.patterns.strategy.behavior.impl;

import com.design.patterns.strategy.behavior.QuackBehavior;

/**
 * 不会叫
 */
public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("。。");
    }

}
