package behaviouralDesignPattern.strategypattern.PaymentGateway;

public class CreditCardPayment implements PaymentStrategy{
    private Integer cardNo;
    private Integer cvv;
    private String expDate;
    public CreditCardPayment(Integer cardNo, Integer cvv, String expDate){
        this.cardNo=cardNo;
        this.cvv=cvv;
        this.expDate=expDate;
    }
    @Override
    public void pay(int amount ){
        System.out.println("Paid amount :: " +amount+" using Credit Card ");
    }
}
