package Ch2.WeatherStation;

public class CurrentConditionsDisplay implements Observer{
    private float temperature;
    private float humidity;
    private WeatherData weatherData;
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "C degrees and " + humidity + "% humidity");
    }
}
