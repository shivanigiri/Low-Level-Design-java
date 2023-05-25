package behaviouralDesignPattern.strategypattern.withoutstrategy.vehicleExample;

public class OffRoadVehicle extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Normal Driving capability");
    }
}
