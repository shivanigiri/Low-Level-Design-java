package structuralDesignPattern.decoratorPattern.pizzaOrderingSystem;

public class User {
    public static void main(String arg[]){
        BasePizza basePizza=new FarmHouse();
        System.out.println(basePizza.prepare());
        System.out.println(basePizza.getCost());

        basePizza=new ExtraCheese(new FarmHouse());
        System.out.println(basePizza.prepare());
        System.out.println(basePizza.getCost());

        basePizza=new OliveTopping(new Margherita());
        System.out.println(basePizza.prepare());
        System.out.println(basePizza.getCost());

        basePizza=new ExtraCheese(new OliveTopping(new Margherita()));
        System.out.println(basePizza.prepare());
        System.out.println(basePizza.getCost());
    }
}
