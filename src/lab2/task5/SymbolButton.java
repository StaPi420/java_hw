package lab2.task5;

public class SymbolButton implements Button{
    private final char symbol;
    private final TextEditor textEditor;

    public SymbolButton(TextEditor textEditorSet, char symbolSet){
        symbol = symbolSet;
        textEditor = textEditorSet;
    }

    @Override
    public void Execute() {
        textEditor.printSymbol(symbol);
    }

    @Override
    public void Undo() {
        textEditor.deleteLastSymbol();
    }
}
