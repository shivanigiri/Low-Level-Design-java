package behaviouralDesignPattern.observerpattern.stockMarketUpdate.observable;


import behaviouralDesignPattern.observerpattern.stockMarketUpdate.observer.StockMarketObserver;

public interface StockSubject {
    void register(StockMarketObserver stockMarketObserver);
    void unRegister(StockMarketObserver stockMarketObserver);
    void notify(String stockName, double price);
}
