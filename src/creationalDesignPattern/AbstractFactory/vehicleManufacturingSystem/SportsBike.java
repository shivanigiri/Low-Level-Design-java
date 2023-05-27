package creationalDesignPattern.AbstractFactory.vehicleManufacturingSystem;

public class SportsBike extends Vehicle{
    public SportsBike() {
        type="Bike";
        variant="Sports Bike";
    }
    @Override
    public void manufacture() {
        System.out.println(" Manufacturing Sports Bike ");
    }
}
