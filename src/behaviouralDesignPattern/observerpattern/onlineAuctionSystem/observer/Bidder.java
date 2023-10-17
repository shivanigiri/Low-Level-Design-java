package behaviouralDesignPattern.observerpattern.onlineAuctionSystem.observer;

public interface Bidder {
    public void update(int highestBid,String nameOfBidder);
}
