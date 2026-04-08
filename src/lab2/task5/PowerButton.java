package lab2.task5;

public class PowerButton implements Button{
    private final TextEditor textEditor;

    public PowerButton(TextEditor textEditorSet){
        textEditor = textEditorSet;
    }

    public void Execute(){
        textEditor.on();
    }

    public void Undo(){
        textEditor.off();
    }
}
