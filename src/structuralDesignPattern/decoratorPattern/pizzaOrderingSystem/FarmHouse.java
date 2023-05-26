package structuralDesignPattern.decoratorPattern.pizzaOrderingSystem;

public class FarmHouse extends BasePizza{
    @Override
    public String prepare() {
        return "preparing FarmHouse";
    }

    @Override
    public int getCost() {
        return 500;
    }

}
