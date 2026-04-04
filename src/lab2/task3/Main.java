package lab2.task3;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args){
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.pay(10, 0.25);
        LegacyPaymentProcessor legacyPaymentProcessor = new LegacyPaymentProcessor();
        legacyPaymentProcessor.make_payment(10);
        Adapter adapter = new Adapter(legacyPaymentProcessor);
        adapter.pay(10, 0.25);
    }
}
