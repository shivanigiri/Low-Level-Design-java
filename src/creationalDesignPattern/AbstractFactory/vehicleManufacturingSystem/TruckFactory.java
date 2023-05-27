package creationalDesignPattern.AbstractFactory.vehicleManufacturingSystem;

public class TruckFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle(String variant) {
        if (variant.equalsIgnoreCase("pickUp")) {
            return new PickUpTruck();
        } else if (variant.equalsIgnoreCase("dump")) {
            return new DumpTruck();
        }
        return null;
    }
}