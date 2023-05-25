package behaviouralDesignPattern.strategypattern.PaymentGateway;

public class UpiPayment implements PaymentStrategy{
    private String upiId;
    public UpiPayment(String upiId){
        super();
        this.upiId=upiId;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paid amount :: " +amount+" using UPI payment");
    }
}
