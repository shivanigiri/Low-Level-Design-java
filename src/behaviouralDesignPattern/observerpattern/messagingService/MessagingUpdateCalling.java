package behaviouralDesignPattern.observerpattern.messagingService;

import behaviouralDesignPattern.observerpattern.messagingService.observable.MessagingService;
import behaviouralDesignPattern.observerpattern.messagingService.observer.Message;
import behaviouralDesignPattern.observerpattern.messagingService.observer.Observer;
import behaviouralDesignPattern.observerpattern.messagingService.observer.User;

public class MessagingUpdateCalling {
    public static void main(String args[]){
        MessagingService messagingService=new MessagingService();
        User userBob=new User("Bob");
        User userMarley=new User("marley");
        messagingService.register(userBob);
        messagingService.register(userMarley);

        Message message=new Message("this is new message");
        messagingService.setMessage(message);

        messagingService.unRegister(userMarley);
        message=new Message("this is another message");
        messagingService.setMessage(message);
    }
}
