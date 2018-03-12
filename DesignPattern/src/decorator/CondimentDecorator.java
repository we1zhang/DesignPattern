package decorator;

/**
 * 作料
 */

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();

    protected double getExtraCost(int size){
        double cost=0;
        switch (size) {
            case SIZE_SMALL:
                cost += 0.10;
                break;
            case SIZE_MIDDLE:
                cost += 0.15;
                break;
            case SIZE_LARGE:
                cost += 0.20;
                break;
        }
        return cost;
    }
}
