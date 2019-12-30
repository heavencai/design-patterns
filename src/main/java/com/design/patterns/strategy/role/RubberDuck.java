package com.design.patterns.strategy.role;

import com.design.patterns.strategy.base.Duck;
import com.design.patterns.strategy.behavior.impl.FlyNoWay;
import com.design.patterns.strategy.behavior.impl.Squeak;

/**
 * 橡皮鸭
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        // 不会飞
        flyBehavior = new FlyNoWay();
        // 吱吱叫
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a RubberDuck");
    }

}
