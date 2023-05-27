package creationalDesignPattern.AbstractFactory.vehicleManufacturingSystem;

import java.util.Objects;

public class BuyerCallingFunction {
    public static void main(String args[]){
        VehicleFactory vehicleFactory= new CarFactory();
        Vehicle vehicleCar= vehicleFactory.createVehicle("sedan");
        if(Objects.nonNull(vehicleCar)) {
            System.out.println("Created a " + vehicleCar.getType() + " of variant " + vehicleCar.getVariant());
            vehicleCar.manufacture();
        }

        vehicleFactory= new BikeFactory();
        Vehicle vehicleBike= vehicleFactory.createVehicle("sports");
        if(Objects.nonNull(vehicleBike)) {
            System.out.println("Created a " + vehicleBike.getType() + " of variant " + vehicleBike.getVariant());
            vehicleBike.manufacture();
        }

        vehicleFactory= new TruckFactory();
        Vehicle vehicleTruck= vehicleFactory.createVehicle("pickup");
        if(Objects.nonNull(vehicleBike)) {
            System.out.println("Created a " + vehicleTruck.getType() + " of variant " +vehicleTruck.getVariant());
            vehicleTruck.manufacture();
        }
        // this will not print anything since vehicle is carType, we are passing variant type of truck.
        vehicleFactory= new CarFactory();
        Vehicle vehicle= vehicleFactory.createVehicle("pickup");
        if(Objects.nonNull(vehicle)) {
            System.out.println("Created a " + vehicle.getType() + " of variant " +vehicle.getVariant());
            vehicle.manufacture();
        }

    }
}
