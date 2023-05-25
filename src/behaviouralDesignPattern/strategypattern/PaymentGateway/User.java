package behaviouralDesignPattern.strategypattern.PaymentGateway;

public class User {
    public static void main(String args[]){
        ShoppingKart shoppingKart= new ShoppingKart();
        PaymentStrategy paymentStrategy= new CreditCardPayment(111111,123,"08/12");
        shoppingKart.setPaymentStrategy(paymentStrategy);
        shoppingKart.makePayment(50000);
        paymentStrategy=new UpiPayment("12345@ybl");
        shoppingKart.setPaymentStrategy(paymentStrategy);
        shoppingKart.makePayment(2000);
    }
}
