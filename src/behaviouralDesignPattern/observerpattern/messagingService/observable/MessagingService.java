package behaviouralDesignPattern.observerpattern.messagingService.observable;

import behaviouralDesignPattern.observerpattern.messagingService.observer.Message;
import behaviouralDesignPattern.observerpattern.messagingService.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class MessagingService implements MessageSubject{
    List<Observer> observerList;
    public MessagingService(){
        observerList=new ArrayList<>();
    }
    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifier(Message message) {
    for(Observer observer: observerList){
        observer.update(message);
       }
    }
    public void setMessage(Message message){
        notifier(message);
    }
}
