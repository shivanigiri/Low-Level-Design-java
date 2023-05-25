package behaviouralDesignPattern.observerpattern.stockMarketUpdate.observable;



import behaviouralDesignPattern.observerpattern.stockMarketUpdate.observer.StockMarketObserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockExchange implements StockSubject{
   Map<String, Double> stockPriceMap;
   List<StockMarketObserver> stockMarketObserverList;
   public StockExchange(){
       stockMarketObserverList = new ArrayList<>();
       stockPriceMap=new HashMap<>();
   }

    @Override
    public void register(StockMarketObserver stockMarketObserver) {
       stockMarketObserverList.add(stockMarketObserver);
    }

    @Override
    public void unRegister(StockMarketObserver stockMarketObserver) {
        stockMarketObserverList.remove(stockMarketObserver);
    }

    @Override
    public void notify(String stockName, double price) {
        for(StockMarketObserver stockMarketObserver : stockMarketObserverList){
            stockMarketObserver.update(stockName,price);
        }
    }

    public void setStockDetail(String stockName, double price){
        stockPriceMap.put(stockName,price);
        notify(stockName,price);
    }
}
