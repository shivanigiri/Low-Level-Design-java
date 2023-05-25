package behaviouralDesignPattern.strategypattern.withstrategy.vehicleExample;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(){
        super(new SpecialDriveStrategy());
    }

}
