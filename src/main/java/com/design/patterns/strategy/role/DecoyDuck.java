package com.design.patterns.strategy.role;

import com.design.patterns.strategy.base.Duck;
import com.design.patterns.strategy.behavior.impl.FlyNoWay;
import com.design.patterns.strategy.behavior.impl.MuteQuack;
import com.design.patterns.strategy.behavior.impl.Squeak;

/**
 * 诱饵鸭
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        // 不会飞
        setFlyBehavior(new FlyNoWay());
        // 不会叫
        setQuackBehavior(new MuteQuack());
    }

    public void display() {
        System.out.println("I'm a DecoyDuck");
    }

}
