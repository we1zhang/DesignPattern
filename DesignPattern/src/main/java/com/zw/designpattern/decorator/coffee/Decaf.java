package com.zw.designpattern.decorator.coffee;


import com.zw.designpattern.decorator.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
        this.size = SIZE_SMALL;
    }

    public Decaf(int size){
        this.size = size;
    }


    @Override
    public double cost() {
        return 12;
    }
}
