package decorator.condiment;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Soy";
    }

    @Override
    public double cost() {
        return getExtraCost(beverage.getSize()) + beverage.cost();
    }
}
