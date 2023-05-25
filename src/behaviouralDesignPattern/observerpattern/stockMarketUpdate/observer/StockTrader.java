package behaviouralDesignPattern.observerpattern.stockMarketUpdate.observer;

public class StockTrader implements StockMarketObserver{
    String name;
    public StockTrader(String name) {
        this.name=name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("Notified to = "+ name +", stock name = "+ stockName+" :: " + "price = " + price);
    }
}
