package behaviouralDesignPattern.observerpattern.weatherStation;

import behaviouralDesignPattern.observerpattern.weatherStation.observable.WeatherStation;
import behaviouralDesignPattern.observerpattern.weatherStation.observer.FanAutomaticWeatherObserver;
import behaviouralDesignPattern.observerpattern.weatherStation.observer.MobileWeatherObserver;

public class WeatherCallingClass {
    public static void callingFunction(){
        WeatherStation weatherStation=new WeatherStation();
        FanAutomaticWeatherObserver fanAutomaticObserver=new FanAutomaticWeatherObserver();
        MobileWeatherObserver mobileObserver=new MobileWeatherObserver();
        weatherStation.registerUser(fanAutomaticObserver);
        weatherStation.registerUser(mobileObserver);
        weatherStation.setTemperature(19);
        weatherStation.setTemperature(33);
        weatherStation.unRegisterUser(fanAutomaticObserver);
        weatherStation.setTemperature(25);
    }
    public static void main(String[] args) {
        callingFunction();
    }
}
