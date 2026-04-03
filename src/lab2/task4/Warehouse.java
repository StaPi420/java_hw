package lab2.task4;

public class Warehouse implements Subscriber{
    public void notifySubscriber(){
        System.out.println("Склад уведомлен о заказе. Товар готовится к отправке");
    }

    @Override
    public String toString(){
        return "Склад";
    }
}
