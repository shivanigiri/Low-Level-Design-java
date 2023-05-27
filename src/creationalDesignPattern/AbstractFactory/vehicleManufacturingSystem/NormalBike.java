package creationalDesignPattern.AbstractFactory.vehicleManufacturingSystem;

public class NormalBike extends Vehicle{
    public NormalBike() {
        type="Bike";
        variant="Normal Bike";
    }
    @Override
    public void manufacture() {
        System.out.println(" Manufacturing Normal Bike ");
    }
}

