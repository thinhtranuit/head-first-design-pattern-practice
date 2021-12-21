package thinhtran.com.observer.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.Observable;

@Getter
@Setter
public class WeatherData extends Observable {
    float temp;
    float humidity;
    float pressure;

    public void setPressure(float pressure) {
        this.pressure = pressure;
        this.setChanged();
    }
}
