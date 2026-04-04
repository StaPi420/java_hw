package lab2.task4;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args){
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        OrderService orderService = new OrderService();
        orderService.subscribe(new Warehouse());
        orderService.subscribe(new DeliveryService());
        orderService.subscribe(new UserNotificationService());
        orderService.notifyAllSubscribers();
    }
}
