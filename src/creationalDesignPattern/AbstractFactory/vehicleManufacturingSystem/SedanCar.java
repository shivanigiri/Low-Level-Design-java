package creationalDesignPattern.AbstractFactory.vehicleManufacturingSystem;

public class SedanCar extends Vehicle{
    public SedanCar() {
        type="Car";
        variant="Sedan Car";
    }
    @Override
    public void manufacture() {
        System.out.println(" Manufacturing Sedan Car ");
    }
}
