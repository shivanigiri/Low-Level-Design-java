package behaviouralDesignPattern.observerpattern.stockMarketUpdate;

import behaviouralDesignPattern.observerpattern.stockMarketUpdate.observable.StockExchange;
import behaviouralDesignPattern.observerpattern.stockMarketUpdate.observer.StockTrader;

public class StockMarketCalling{
    public static void calling(){
        StockExchange stockExchange= new StockExchange();
        StockTrader stockTrader1= new StockTrader("Bob");
        StockTrader stockTrader2= new StockTrader("Marley");
        stockExchange.register(stockTrader1);
        stockExchange.register(stockTrader2);
        stockExchange.setStockDetail("Mirae", 1010);
        stockExchange.setStockDetail("Canara", 2000);
        stockExchange.unRegister(stockTrader1);
        stockExchange.setStockDetail("hdfc",2050);
    }
    public static void main(String[] args) {
        calling();
    }
}
