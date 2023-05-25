package behaviouralDesignPattern.strategypattern.withstrategy.vehicleExample;

public class SportsVehicle extends Vehicle{
    public SportsVehicle(){
        super(new SpecialDriveStrategy());
    }
}
