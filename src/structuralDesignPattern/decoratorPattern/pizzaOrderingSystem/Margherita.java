package structuralDesignPattern.decoratorPattern.pizzaOrderingSystem;

public class Margherita extends BasePizza{
    @Override
    public String prepare() {
        return "preparing Margherita";
    }

    @Override
    public int getCost() {
        return 300;
    }
}
