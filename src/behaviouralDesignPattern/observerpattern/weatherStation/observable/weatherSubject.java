package behaviouralDesignPattern.observerpattern.weatherStation.observable;

import behaviouralDesignPattern.observerpattern.weatherStation.observer.WeatherObserver;

public interface weatherSubject {
    void registerUser(WeatherObserver weatherObserver);
    void unRegisterUser(WeatherObserver weatherObserver);
    void notifyUser();
}
