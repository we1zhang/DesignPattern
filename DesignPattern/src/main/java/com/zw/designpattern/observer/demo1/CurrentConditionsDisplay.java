package com.zw.designpattern.observer.demo1;

public class CurrentConditionsDisplay implements DisplayElement ,Observer{

    private int temp;
    private int humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public CurrentConditionsDisplay() {
    }

    @Override
    public void display() {
        System.out.println("temp="+temp+" humidity="+humidity);
    }

    @Override
    public void updateData(int temp, int humidity, int pressure) {
       this.temp = temp;
       this.humidity = humidity;
       display();
    }
}
