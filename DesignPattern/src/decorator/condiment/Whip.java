package decorator.condiment;

import decorator.Beverage;
import decorator.CondimentDecorator;

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
