package lab2.task4;

public class DeliveryService implements Subscriber{
    public void notifySubscriber(){
        System.out.println("Служба доставки уведомлена о заказе. Доставка запланирована");
    }

    @Override
    public String toString(){
        return "Служба доставки";
    }
}
