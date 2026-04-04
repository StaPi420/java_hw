package lab1.task5;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static Object lock = new Object();
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Stamper stamper = new Stamper();
        Collector collector = new Collector();
        QAOperator qaOperator = new QAOperator();
        Thread stamperThread = new Thread(stamper);
        Thread collectorThread = new Thread(collector);
        Thread qaOperatorThread = new Thread(qaOperator);

        stamperThread.start();
        collectorThread.start();
        qaOperatorThread.start();
    }
}
