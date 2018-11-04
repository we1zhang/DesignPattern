package com.zw.designpattern.decorator.coffee;


import com.zw.designpattern.decorator.Beverage;

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
