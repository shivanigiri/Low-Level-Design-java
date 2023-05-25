package behaviouralDesignPattern.observerpattern.weatherStation.observer;

public class FanAutomaticWeatherObserver implements WeatherObserver {
    @Override
    public void update(int temp) {
        if(temp>=20){
            System.out.println("Turn on the Fan ");
        }else{
            System.out.println("Turn off the Fan ");
        }
    }
}
