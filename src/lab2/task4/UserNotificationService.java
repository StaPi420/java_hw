package lab2.task4;

public class UserNotificationService implements Subscriber{
    public void notifySubscriber(){
        System.out.println("Пользователь уведомлен о заказе.");
    }

    @Override
    public String toString(){
        return "Служба оповещения пользователей";
    }
}
