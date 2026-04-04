package lab1.task4;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        TrafficLight trafficLight = new TrafficLight();
        Thread trafficLightThread = new Thread(trafficLight);
        trafficLightThread.start();
        
        for (int i = 0; i < 5; ++i) {
            Car car = new Car(i + 1, trafficLight);
            Thread carThread = new Thread(car);
            carThread.start();
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        try {
            trafficLightThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}