package behaviouralDesignPattern.strategypattern.withstrategy.vehicleExample;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("normal driving capability");
    }
}
