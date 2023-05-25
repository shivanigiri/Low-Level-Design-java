package behaviouralDesignPattern.strategypattern.withstrategy.vehicleExample;

import behaviouralDesignPattern.strategypattern.withstrategy.vehicleExample.GoodsVehicle;
import behaviouralDesignPattern.strategypattern.withstrategy.vehicleExample.OffRoadVehicle;
import behaviouralDesignPattern.strategypattern.withstrategy.vehicleExample.SportsVehicle;
import behaviouralDesignPattern.strategypattern.withstrategy.vehicleExample.Vehicle;

public class CallingClass {
    //just for reducing code in main class
    public static void callVehicleStrategy() {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
        vehicle = new GoodsVehicle();
        vehicle.drive();
        vehicle = new OffRoadVehicle();
        vehicle.drive();
    }
    public static void main(String[] args) {
        callVehicleStrategy();
    }
}
