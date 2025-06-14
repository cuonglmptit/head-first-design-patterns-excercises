package Ch2.WeatherStation.Push;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
