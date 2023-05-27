package behaviouralDesignPattern.observerpattern.messagingService.observer;

import behaviouralDesignPattern.observerpattern.messagingService.observable.MessagingService;

public class Message {
    String message;
    public Message(String message){
        this.message=message;
    }
    public String getContent(){
    return this.message;
    }
}
