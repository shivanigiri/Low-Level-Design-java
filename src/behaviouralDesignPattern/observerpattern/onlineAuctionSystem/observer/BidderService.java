package behaviouralDesignPattern.observerpattern.onlineAuctionSystem.observer;

public class BidderService implements Bidder{
    String biddername;
    public BidderService(String name){
        this.biddername=name;
    }
    public String getName(){
        return this.biddername;
    }

    @Override
    public void update(int highestBid, String nameOfBidder) {
        System.out.println("Hi "+this.biddername+"! Bid is:: "+ highestBid+" by :: "+ nameOfBidder+".");
    }
}
