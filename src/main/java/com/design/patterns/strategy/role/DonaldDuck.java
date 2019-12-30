package com.design.patterns.strategy.role;

import com.design.patterns.strategy.base.Duck;
import com.design.patterns.strategy.behavior.impl.FlyWithWings;
import com.design.patterns.strategy.behavior.impl.Squeak;

/**
 * 唐老鸭
 */
public class DonaldDuck extends Duck {

    public DonaldDuck() {
        // 会飞
        flyBehavior = new FlyWithWings();
        // 呱呱叫
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a DonaldDuck");
    }

}
