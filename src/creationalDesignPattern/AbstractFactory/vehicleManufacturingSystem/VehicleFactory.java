package creationalDesignPattern.AbstractFactory.vehicleManufacturingSystem;

abstract public class VehicleFactory {
    abstract public Vehicle createVehicle(String variant);
}
