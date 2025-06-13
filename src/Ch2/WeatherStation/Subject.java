package Ch2.WeatherStation;

public interface Subject {
    public void registerObserver(Observer o);
    public void removerObserver(Observer o);
    public void notifyObservers();
}

