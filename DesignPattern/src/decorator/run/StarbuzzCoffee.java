package decorator.run;

import decorator.Beverage;
import decorator.coffee.DarkRoast;
import decorator.coffee.Espresso;
import decorator.coffee.HouseBlend;
import decorator.condiment.Milk;
import decorator.condiment.Mocha;
import decorator.condiment.Soy;
import decorator.condiment.Whip;

import java.io.InputStream;

public class StarbuzzCoffee {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        beverage1 = new Whip(beverage1);
        beverage1 = new Whip(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription()+" $"+beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Milk(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
    }

}
