import org.junit.Test;
import thinhtran.com.observer.entities.CurrentConditionsDisplay;
import thinhtran.com.observer.entities.StatisticDisplay;
import thinhtran.com.observer.entities.WeatherData;

public class TestCase {

    @Test
    public void testWeather() {
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticDisplay statisticDisplay = new StatisticDisplay();
        WeatherData weatherData = new WeatherData();
        weatherData.addObserver(currentConditionsDisplay);
        weatherData.addObserver(statisticDisplay);

        weatherData.setHumidity(10);
        weatherData.setTemp(35);
        weatherData.setPressure(3);
        weatherData.notifyObservers();
    }
}
