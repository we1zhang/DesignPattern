package com.zw.designpattern.decorator.run;


import com.zw.designpattern.decorator.Beverage;
import com.zw.designpattern.decorator.coffee.DarkRoast;
import com.zw.designpattern.decorator.coffee.Espresso;
import com.zw.designpattern.decorator.coffee.HouseBlend;
import com.zw.designpattern.decorator.condiment.Milk;
import com.zw.designpattern.decorator.condiment.Mocha;
import com.zw.designpattern.decorator.condiment.Soy;
import com.zw.designpattern.decorator.condiment.Whip;

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
