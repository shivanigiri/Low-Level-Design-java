package structuralDesignPattern.decoratorPattern.pizzaOrderingSystem;

public class OliveTopping extends PizzaDecorator{
    public OliveTopping(BasePizza basePizza) {
        super(basePizza);
    }
    @Override
    public String prepare() {
        return super.basePizza.prepare() + " with Olive Topping ";
    }

    @Override
    public int getCost() {
        return super.basePizza.getCost()+50;
    }
}
