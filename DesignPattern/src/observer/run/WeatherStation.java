package observer.run;

import observer.demo1.CurrentConditionsDisplay;
import observer.demo1.WeatherData;

public class WeatherStation {


    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay();
        weatherData.registerObserver(display);
        weatherData.setMeasurements(10,20,30);
    }
}
