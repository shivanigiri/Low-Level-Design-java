package behaviouralDesignPattern.strategypattern.withstrategy.vehicleExample;

public class Vehicle {
    DriveStrategy driveStrategy; // = new DriveStrategy(); don't do this. then it will be bounded
    Vehicle(DriveStrategy strategy){
    this.driveStrategy=strategy;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
