package com.design.patterns.factory.method.newyork;

import com.design.patterns.factory.method.base.Pizza;

/**
 * 纽约风味的芝士披萨
 */
public class NyStyleCheesePizza extends Pizza {

    public NyStyleCheesePizza() {
        name = "纽约风味的芝士披萨";
        sauce = "黑椒酱";
        toppings.add("热狗");
        toppings.add("牛排");
    }

}
