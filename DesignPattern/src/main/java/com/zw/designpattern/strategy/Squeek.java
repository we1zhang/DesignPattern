package com.zw.designpattern.strategy;

public class Squeek implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeek");
    }
}
