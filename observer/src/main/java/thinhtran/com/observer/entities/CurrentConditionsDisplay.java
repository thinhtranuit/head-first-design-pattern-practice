package thinhtran.com.observer.entities;

import thinhtran.com.observer.common.CommonMethods;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData newValue = (WeatherData)observable;
            System.out.printf("Current temp %f, humidity %f, pressure %f\n", newValue.getTemp(), newValue.getHumidity(), newValue.getPressure());
            System.out.printf("Current heat index: %f\n", CommonMethods.computeHeatIndex(newValue.getTemp(), newValue.getHumidity() / newValue.getPressure()));
        }
    }
}
