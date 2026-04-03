package lab2.task3;

public class Adapter implements PaymentProcessorInterface{
    private LegacyPaymentProcessor legacyPaymentProcessor;

    public Adapter(LegacyPaymentProcessor legacyPaymentProcessor){
        this.legacyPaymentProcessor = legacyPaymentProcessor;
    }

    public void pay(int amount, double discount){
        legacyPaymentProcessor.make_payment(amount);

        System.out.println("Вам возвращено кэшбеком с последней оплаты: " + (amount * discount));
    }
}
