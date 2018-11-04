package com.zw.designpattern.observer.demo2;


import com.zw.designpattern.observer.demo1.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private int temp;
    private int humidity;

    public CurrentConditionsDisplay() {

    }

    public void setObservable(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            this.temp = ((WeatherData) o).getTemp();
            this.humidity = ((WeatherData) o).getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("temp=" + temp + " humidity=" + humidity);
    }

}
