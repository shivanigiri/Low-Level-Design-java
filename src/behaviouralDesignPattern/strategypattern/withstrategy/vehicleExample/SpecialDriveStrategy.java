package behaviouralDesignPattern.strategypattern.withstrategy.vehicleExample;

public class SpecialDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Special drive capability");
    }
}
