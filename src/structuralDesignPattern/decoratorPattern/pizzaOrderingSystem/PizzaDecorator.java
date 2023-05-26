package structuralDesignPattern.decoratorPattern.pizzaOrderingSystem;

public abstract class PizzaDecorator extends BasePizza{
    BasePizza basePizza;
    public PizzaDecorator(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public String prepare() {
        return basePizza.prepare();
    }

    @Override
    public int getCost() {
       return basePizza.getCost();
    }
}
