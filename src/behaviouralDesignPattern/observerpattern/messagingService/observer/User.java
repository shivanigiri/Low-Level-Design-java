package behaviouralDesignPattern.observerpattern.messagingService.observer;

public class User implements Observer{
    String name;
    public User(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    @Override
    public void update(Message message) {
        System.out.println(name+" received new message : "+message.getContent());
    }
}
