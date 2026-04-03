package lab2.task3;

public class PaymentProcessor implements PaymentProcessorInterface{
    public void pay(int amount, double discount){
        System.out.println("Совершена оплата. Со счёта списалось: " + ((1 - discount) * amount));
    }
}
