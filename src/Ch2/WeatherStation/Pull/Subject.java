package Ch2.WeatherStation.Pull;

public interface Subject {
    public void registerObserver(Observer o);
    public void removerObserver(Observer o);
    public void notifyObservers();
}

