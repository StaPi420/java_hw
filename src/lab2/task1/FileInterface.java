package lab2.task1;

import java.io.*;

public class FileInterface {
    private static FileInterface instance;
    private File file = new File("file");

    private FileInterface() {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static FileInterface getInstance() {
        if (instance == null) {
            instance = new FileInterface();
        }
        return instance;
    }

    public void writeToFile(String content) {
        try (FileWriter writer = new FileWriter("file.txt", true)) {
            writer.write(content + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String readFromFile() {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    
}
