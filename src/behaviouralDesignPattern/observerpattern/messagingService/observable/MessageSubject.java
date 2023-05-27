package behaviouralDesignPattern.observerpattern.messagingService.observable;

import behaviouralDesignPattern.observerpattern.messagingService.observer.Message;
import behaviouralDesignPattern.observerpattern.messagingService.observer.Observer;

public interface MessageSubject {
    public void register(Observer observer);
    public void unRegister(Observer observer);
    public void notifier(Message message);
}
