package observer.run;

import observer.demo2.CurrentConditionsDisplay;
import observer.demo2.WeatherData;

public class WeatherStation2 {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay();
        weatherData.addObserver(display);
        weatherData.setMeasurements(10,20,30);

    }
}
