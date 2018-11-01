package decorator.condiment;

import decorator.Beverage;
import decorator.CondimentDecorator;

import java.util.ArrayList;

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
