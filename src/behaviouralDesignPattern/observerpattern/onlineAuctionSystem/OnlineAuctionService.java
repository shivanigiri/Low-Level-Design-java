package behaviouralDesignPattern.observerpattern.onlineAuctionSystem;

import behaviouralDesignPattern.observerpattern.onlineAuctionSystem.observable.AuctioneerService;
import behaviouralDesignPattern.observerpattern.onlineAuctionSystem.observer.BidderService;

public class OnlineAuctionService {
    public static void main(String args[]){

        BidderService drDre=new BidderService("drDre");
        BidderService lilV=new BidderService("lil V");
        BidderService snoopDog=new BidderService("snoopDog");
        AuctioneerService auctioneerService=new AuctioneerService();
        auctioneerService.register(lilV);
        auctioneerService.register(drDre);
        auctioneerService.register(snoopDog);
        auctioneerService.setBiddingPrice(100,lilV);
        auctioneerService.setBiddingPrice(130,drDre);
        auctioneerService.setBiddingPrice(125,snoopDog);
        auctioneerService.getWinner();
        auctioneerService.unregister(lilV);
        BidderService kWest=new BidderService("k West");
        BidderService drake=new BidderService("drake");
        BidderService cent=new BidderService("50 cent");
        BidderService eminem=new BidderService("eminem");
        auctioneerService.register(kWest);
        auctioneerService.register(drake);
        auctioneerService.register(cent);
        auctioneerService.register(eminem);
        auctioneerService.setBiddingPrice(155,kWest);
        auctioneerService.setBiddingPrice(160,cent);
        auctioneerService.setBiddingPrice(280,drake);
        auctioneerService.setBiddingPrice(500,eminem);
        auctioneerService.getWinner();

    }
}
