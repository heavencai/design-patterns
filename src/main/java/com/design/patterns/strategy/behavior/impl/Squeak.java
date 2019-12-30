package com.design.patterns.strategy.behavior.impl;

import com.design.patterns.strategy.behavior.QuackBehavior;

/**
 * 吱吱叫
 */
public class Squeak implements QuackBehavior {

    public void quack() {
        System.out.println("吱吱。。");
    }

}
