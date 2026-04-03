package lab2.task1;

public class Main {
    public static void main(String[] args) {
        FileInterface fileInterface = FileInterface.getInstance();
        fileInterface.writeToFile("Hello, World!");
        FileInterface fileInterface1 = FileInterface.getInstance();
        System.out.println(fileInterface1.readFromFile());
    }
}
