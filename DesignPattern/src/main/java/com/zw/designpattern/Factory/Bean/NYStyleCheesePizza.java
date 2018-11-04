package com.zw.designpattern.Factory.Bean;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "YN style sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";//大蒜番茄酱
        toppings.add("Grated Reggiano Cheese");//意大利高级干酪
    }
}
