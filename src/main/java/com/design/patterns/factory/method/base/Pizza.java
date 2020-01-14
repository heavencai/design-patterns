package com.design.patterns.factory.method.base;

import java.util.ArrayList;
import java.util.List;

/**
 * 披萨
 */
public abstract class Pizza {

    // 披萨名
    protected String name;
    // 酱料
    protected String sauce;
    // 配料
    protected List<String> toppings = new ArrayList();

    protected void prepare() {
        System.out.println("准备披萨: " + name);
        System.out.println("放入酱料: " + sauce);
        for (String top : toppings) {
            System.out.println("放入配料: " + top);
        }
    }

    protected void bake() {
        System.out.println("烤披萨...");
    }

    protected void cut() {
        System.out.println("切披萨...");
    }

    protected void box() {
        System.out.println("披萨装盘...");
    }

}
