package structuralDesignPattern.decoratorPattern.pizzaOrderingSystem;

public class ExtraCheese extends PizzaDecorator {
    public ExtraCheese(BasePizza basePizza) {
        super(basePizza);
    }
    @Override
    public String prepare() {
        return super.basePizza.prepare() + " with extra cheese ";
    }

    @Override
    public int getCost() {
        return super.basePizza.getCost()+60;
    }
}
