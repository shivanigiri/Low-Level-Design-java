package creationalDesignPattern.AbstractFactory.vehicleManufacturingSystem;

abstract public class Vehicle {
     String type;
    String variant;
    abstract public void manufacture();
    public String getType(){
        return type;
    }
    public String getVariant(){
        return variant;
    }
}
