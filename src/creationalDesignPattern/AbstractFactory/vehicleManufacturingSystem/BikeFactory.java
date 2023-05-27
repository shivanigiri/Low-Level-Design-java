package creationalDesignPattern.AbstractFactory.vehicleManufacturingSystem;

public class BikeFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle(String variant) {
        if (variant.equalsIgnoreCase("sports")) {
            return new SportsBike();
        } else if (variant.equalsIgnoreCase("normal")) {
            return new NormalBike();
        }
        return null;
    }
}