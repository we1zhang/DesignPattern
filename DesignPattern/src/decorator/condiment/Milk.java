package decorator.condiment;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Milk";
    }

    @Override
    public double cost() {
        return getExtraCost(beverage.getSize()) + beverage.cost();
    }
}
