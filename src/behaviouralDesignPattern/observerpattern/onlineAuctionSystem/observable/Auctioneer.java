package behaviouralDesignPattern.observerpattern.onlineAuctionSystem.observable;

import behaviouralDesignPattern.observerpattern.onlineAuctionSystem.observer.Bidder;

public interface Auctioneer {
    public void register(Bidder bidder);
    public void unregister(Bidder bidder);
    public void notify(int bidPrice, String bidderName);

}
