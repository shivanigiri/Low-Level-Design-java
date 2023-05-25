package behaviouralDesignPattern.observerpattern.weatherStation.observable;

import behaviouralDesignPattern.observerpattern.weatherStation.observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements weatherSubject {
    private int temp;
    private List<WeatherObserver> weatherObserverList;
    public WeatherStation(){
        weatherObserverList =new ArrayList<>();
    }

    @Override
    public void registerUser(WeatherObserver weatherObserver) {
        weatherObserverList.add(weatherObserver);
    }

    @Override
    public void unRegisterUser(WeatherObserver weatherObserver) {
        weatherObserverList.remove(weatherObserver);
    }

    @Override
    public void notifyUser() {
        for(WeatherObserver weatherObserver : weatherObserverList){
            weatherObserver.update(temp);
        }
    }
    public void setTemperature(int temp){
        this.temp=temp;
        notifyUser();
    }
}
