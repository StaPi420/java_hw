package lab2.task5;

import java.util.ArrayList;
import java.util.Stack;

public class Keyboard {
    private final TextEditor textEditor;
    private String symbols = "qwertyuiop";
    public ArrayList<Button> buttons = new ArrayList<>();
    private Stack<Button> commandsHistory = new Stack<Button>();
    public Keyboard(TextEditor textEditorSet){
        textEditor = textEditorSet;
        buttons.add(new PowerButton(textEditor));
        for (int i = 0; i < symbols.length(); ++i){
            buttons.add(new SymbolButton(textEditor, symbols.charAt(i)));
        }
    }

    public void pressButton(int i){
        buttons.get(i).Execute();
        commandsHistory.push(buttons.get(i));
    }

    public void pressUndoButton(){
        if (!commandsHistory.isEmpty()){
            Button lastCommand = commandsHistory.pop();
            lastCommand.Undo();
        }
    }
}
