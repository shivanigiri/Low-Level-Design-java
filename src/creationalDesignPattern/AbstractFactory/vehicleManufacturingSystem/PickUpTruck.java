package creationalDesignPattern.AbstractFactory.vehicleManufacturingSystem;

public class PickUpTruck extends Vehicle{
    public PickUpTruck(){
        type="Truck";
        variant=" PickUp Truck";
    }
    @Override
    public void manufacture() {
        System.out.println(" Manufacturing pickUp truck");
    }
}

