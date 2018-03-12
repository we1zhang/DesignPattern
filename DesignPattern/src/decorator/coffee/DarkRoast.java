package decorator.coffee;

import decorator.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
        this.size =SIZE_SMALL;
    }

    public DarkRoast(int size){
        this.size = size;
    }

    @Override
    public double cost() {
        return 10;
    }
}
