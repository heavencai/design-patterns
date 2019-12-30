package com.design.patterns.strategy.role;

import com.design.patterns.strategy.base.Duck;
import com.design.patterns.strategy.behavior.impl.FlyNoWay;
import com.design.patterns.strategy.behavior.impl.FlyWithWings;
import com.design.patterns.strategy.behavior.impl.Squeak;

/**
 * 可达鸭
 */
public class PsyDuck extends Duck {

    public PsyDuck() {
        // 会飞
        flyBehavior = new FlyWithWings();
        // 呱呱叫
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a PsyDuck");
    }

}
