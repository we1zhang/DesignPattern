package com.zw.designpattern.decorator.condiment;


import com.zw.designpattern.decorator.Beverage;
import com.zw.designpattern.decorator.CondimentDecorator;

/**
 * whip
 */

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    @Override
    public String getDescription() {
        return  beverage.getDescription()+",Whip";
    }

    @Override
    public double cost() {
        return getExtraCost(beverage.getSize()) + beverage.cost();
    }
}
