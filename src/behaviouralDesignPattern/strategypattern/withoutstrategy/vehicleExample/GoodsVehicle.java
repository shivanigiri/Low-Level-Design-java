package behaviouralDesignPattern.strategypattern.withoutstrategy.vehicleExample;

public class GoodsVehicle extends Vehicle {
    @Override
    public void drive() {
        //same code in goods and sports car //code is getting duplicated //not reusing the code
        System.out.println("require driving special capability");
    }
}
