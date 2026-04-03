package lab2.task4;

import java.util.ArrayList;

public class OrderService {
    private ArrayList<Subscriber> subscribers;

    public OrderService(){
        subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
        System.out.println("Subscriber " + subscriber + " подписан");
    }

    public void notifyAllSubscribers(){
        for (Subscriber subscriber : subscribers){
            subscriber.notifySubscriber();
        }
    }
}
