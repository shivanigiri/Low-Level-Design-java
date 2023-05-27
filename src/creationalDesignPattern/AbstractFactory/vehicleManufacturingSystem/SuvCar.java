package creationalDesignPattern.AbstractFactory.vehicleManufacturingSystem;

public class SuvCar extends Vehicle {
    public SuvCar() {
        type="Car";
        variant="Suv Car";
    }
    @Override
    public void manufacture() {
        System.out.println(" Manufacturing Suv Car ");
    }
}
