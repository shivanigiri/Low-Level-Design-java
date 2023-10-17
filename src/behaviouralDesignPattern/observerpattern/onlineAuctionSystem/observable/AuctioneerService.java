package behaviouralDesignPattern.observerpattern.onlineAuctionSystem.observable;

import behaviouralDesignPattern.observerpattern.onlineAuctionSystem.observer.Bidder;
import behaviouralDesignPattern.observerpattern.onlineAuctionSystem.observer.BidderService;

import java.util.*;

public class AuctioneerService implements  Auctioneer{
    Map<String, Integer> bidRecordMap;
    private List<Bidder > bidderList;

    public AuctioneerService(){
        this.bidderList=new ArrayList<>();
        this.bidRecordMap=new HashMap<>();
    }
    @Override
    public void register(Bidder bidder) {
        bidderList.add(bidder);
    }

    @Override
    public void unregister(Bidder bidder) {
        bidderList.remove(bidder);
    }

    @Override
    public void notify(int bidPrice, String bidderName) {
        for(Bidder b: bidderList){
            b.update(bidPrice,bidderName);
        }
    }

    public void setBiddingPrice(int bidPrice, BidderService bidderService){
        //store only max bid
        bidRecordMap.put(bidderService.getName(),bidPrice);
        notify(bidPrice, bidderService.getName());
    }
    public void getWinner() {
        String name="";
        int price=0,maxPrice=0;
        for(Map.Entry<String, Integer> entry: bidRecordMap.entrySet()){
            if(entry.getValue()>maxPrice){
                maxPrice= entry.getValue();
                name= entry.getKey();
            }
        }
        System.out.println("Sold to : "+name+" with bidding price of: "+maxPrice);
    }
}
