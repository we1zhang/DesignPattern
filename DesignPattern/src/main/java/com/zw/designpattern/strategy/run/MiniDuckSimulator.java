package com.zw.designpattern.strategy.run;


import com.zw.designpattern.strategy.FlyRocketPowered;
import com.zw.designpattern.strategy.bean.Duck;
import com.zw.designpattern.strategy.bean.MallardDuck;
import com.zw.designpattern.strategy.bean.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
