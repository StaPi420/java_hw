package lab2.task4;

public class Main {
    public static void main(String[] args){
        OrderService orderService = new OrderService();
        orderService.subscribe(new Warehouse());
        orderService.subscribe(new DeliveryService());
        orderService.subscribe(new UserNotificationService());
        orderService.notifyAllSubscribers();
    }
}
