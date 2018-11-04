package com.zw.designpattern.observer.run;


import com.zw.designpattern.observer.demo2.CurrentConditionsDisplay;
import com.zw.designpattern.observer.demo2.WeatherData;

public class WeatherStation2 {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay();
        weatherData.addObserver(display);
        weatherData.setMeasurements(10,20,30);

    }
}
