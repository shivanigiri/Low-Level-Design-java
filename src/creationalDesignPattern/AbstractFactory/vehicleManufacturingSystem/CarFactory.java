package creationalDesignPattern.AbstractFactory.vehicleManufacturingSystem;

public class CarFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle(String variant) {
        if (variant.equalsIgnoreCase("sedan")) {
            return new SedanCar();
        } else if (variant.equalsIgnoreCase("suv")) {
            return new SuvCar();
        }
        return null;
    }
}
