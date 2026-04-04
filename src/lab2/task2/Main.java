package lab2.task2;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        NotificationCreator emailCreator = new EmailNotificationCreator();
        emailCreator.sendNotification("Привет по электронной почте!");

        NotificationCreator smsCreator = new SMSNotificationCreator();
        smsCreator.sendNotification("Привет по SMS!");
    }
}
