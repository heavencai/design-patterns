package com.design.patterns.factory.abstracts.base;

/**
 * 披萨
 */
public abstract class Pizza {

    // 披萨名
    protected String name;
    // 酱料
    private Sauce sauce;
    // 芝士
    private Cheese cheese;
    // 蔬菜
    private Veggies veggies[];

    protected abstract void prepare();

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
