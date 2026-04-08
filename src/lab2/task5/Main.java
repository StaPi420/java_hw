package lab2.task5;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.security.Key;

public class Main {
    public static void main(String[] args){
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        TextEditor textEditor = new TextEditor();
        Keyboard keyboard = new Keyboard(textEditor);

        for (int i = 0; i < keyboard.buttons.size(); ++i){
            keyboard.pressButton(i);
        }

        for (int i = 0; i < keyboard.buttons.size(); ++i){
            keyboard.pressUndoButton();
        }
    }
}
