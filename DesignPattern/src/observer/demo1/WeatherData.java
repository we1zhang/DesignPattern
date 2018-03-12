package observer.demo1;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;
    private int temp;
    private int humidity;
    private int pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i>=0){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observers){
            o.updateData(temp,humidity,pressure);
        }
    }

    public void setMeasurements(int temp,int humidity,int pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void getTemperature(){

    }

    private void getHumidity(){

    }

    private void getPressure(){

    }

    private void measurementsChanged(){
        notifyObservers();
    }

}
