package strategy.bean;

import strategy.FlyWithWings;
import strategy.Quack;

/**
 * 绿头鸭
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am MallardDuck");
    }
}
