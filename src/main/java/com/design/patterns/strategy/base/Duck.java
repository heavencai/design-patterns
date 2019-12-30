package com.design.patterns.strategy.base;

import com.design.patterns.strategy.behavior.FlyBehavior;
import com.design.patterns.strategy.behavior.QuackBehavior;

/**
 * 鸭子超类
 */
public abstract class Duck {

    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    public Duck() {}

    /**
     * 动态设置飞行行为
     * @param flyBehavior
     */
    public void setFlyBehavior (FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * 动态设置呱呱叫行为
     * @param quackBehavior
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     * 将飞行行为委托给飞行行为类处理
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * 将呱呱叫行为委托给呱呱叫行为类处理
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    /**
     * 所有鸭子都会游泳
     */
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    /**
     * 不同的鸭子长相不同
     */
    public abstract void display();

}
