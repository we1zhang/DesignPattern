package decorator.coffee;

import decorator.Beverage;
import sun.security.krb5.internal.crypto.Des;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "HouseBlend";
        this.size =SIZE_SMALL;
    }

    public HouseBlend(int size){
        this.size = size;
    }

    @Override
    public double cost() {
        return 0.98;
    }
}
