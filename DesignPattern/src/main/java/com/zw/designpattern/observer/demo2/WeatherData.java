package com.zw.designpattern.observer.demo2;

import java.util.Observable;

public class WeatherData extends Observable {
    private int temp;
    private int humidity;
    private int pressure;

    public WeatherData() {
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }


    public void setMeasurements(int temp,int humidity,int pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public int getTemp() {
        return temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }
}
