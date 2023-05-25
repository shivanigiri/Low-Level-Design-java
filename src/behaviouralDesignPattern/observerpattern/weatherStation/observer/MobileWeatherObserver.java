package behaviouralDesignPattern.observerpattern.weatherStation.observer;

public class MobileWeatherObserver implements WeatherObserver {
    @Override
    public void update(int temp) {
        System.out.println("Temperature on Mobile is :: "+ temp);
    }
}
