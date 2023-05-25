package behaviouralDesignPattern.strategypattern.withstrategy.vehicleExample;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
