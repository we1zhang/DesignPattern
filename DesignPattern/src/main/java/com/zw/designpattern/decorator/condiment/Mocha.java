package com.zw.designpattern.decorator.condiment;


import com.zw.designpattern.decorator.Beverage;
import com.zw.designpattern.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    @Override
    public double cost() {
        return getExtraCost(beverage.getSize()) + beverage.cost();
    }
}
