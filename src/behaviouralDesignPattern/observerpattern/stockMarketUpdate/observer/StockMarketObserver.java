package behaviouralDesignPattern.observerpattern.stockMarketUpdate.observer;

public interface StockMarketObserver {
    public void update(String stockName, double price);
}
