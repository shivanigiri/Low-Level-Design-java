package creationalDesignPattern.AbstractFactory.vehicleManufacturingSystem;

public class DumpTruck extends Vehicle{
    public DumpTruck(){
        type="Truck";
        variant="Dump Truck";
    }
    @Override
    public void manufacture() {
        System.out.println(" Manufacturing Dump Truck ");
    }
}

