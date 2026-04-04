package lab2.task1;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        FileInterface fileInterface = FileInterface.getInstance();
        fileInterface.writeToFile("Hello, World!");
        FileInterface fileInterface1 = FileInterface.getInstance();
        System.out.println(fileInterface1.readFromFile());
    }
}
