package behaviouralDesignPattern.strategypattern.PaymentGateway;

public class ShoppingKart {
    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }
    public void makePayment(Integer amount){
        this.paymentStrategy.pay(amount);
    }
}
