package observer.pull;

public interface WeatherSubject {
    void addObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void updateContent(Object content);
    void notificationObserver();

    String getWeather();
    int getTemp();
    int getWindSpeed();
}
