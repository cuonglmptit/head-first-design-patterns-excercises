package Ch2.WeatherStation.Push;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(24, 65, 30.4f);
        weatherData.setMeasurements(30, 70, 29.2f);
        weatherData.setMeasurements(35, 90, 29.2f);
    }
}
