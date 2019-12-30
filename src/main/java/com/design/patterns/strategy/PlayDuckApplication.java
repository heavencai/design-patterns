package com.design.patterns.strategy;

import com.design.patterns.strategy.base.Duck;
import com.design.patterns.strategy.behavior.impl.FlyRocketPowered;
import com.design.patterns.strategy.role.DecoyDuck;
import com.design.patterns.strategy.role.DonaldDuck;
import com.design.patterns.strategy.role.PsyDuck;
import com.design.patterns.strategy.role.RubberDuck;

/**
 * 玩鸭子游戏启动类
 */
public class PlayDuckApplication {

    public static void main(String[] args) {
        // 1. 初始化角色
        // 可达鸭
        Duck psyDuck = new PsyDuck();
        // 唐老鸭
        Duck donaldDuck = new DonaldDuck();
        // 橡皮鸭
        Duck rubberDuck = new RubberDuck();
        // 诱饵鸭
        Duck decoyDuck = new DecoyDuck();

        // 2. 叫
        psyDuck.display();
        psyDuck.performQuack();
        donaldDuck.display();
        donaldDuck.performQuack();
        rubberDuck.display();
        rubberDuck.performQuack();

        // 3. 飞
        decoyDuck.display();
        decoyDuck.performFly();
        // 诱饵鸭升级
        decoyDuck.setFlyBehavior(new FlyRocketPowered());
        decoyDuck.performFly();
    }

}
