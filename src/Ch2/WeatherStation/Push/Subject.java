package Ch2.WeatherStation.Push;

public interface Subject {
    public void registerObserver(Observer o);
    public void removerObserver(Observer o);
    public void notifyObservers();
}

