package decorator.coffee;

import decorator.Beverage;

/**
 * 浓缩咖啡
 */

public class Espresso extends Beverage{

    public Espresso() {
        this.description = "Espresso";
        this.size = SIZE_SMALL;
    }

    public Espresso(int size){
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
