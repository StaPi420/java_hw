package lab2.task5;

public class TextEditor {
    private boolean isOn;
    private StringBuilder text = new StringBuilder();

    public void on(){
        System.out.println("Текстовый редактор включён");
        isOn = true;
    }

    public void off(){
        System.out.println("Текстовый редактор выклёчен");
        isOn = false;
    }

    public void printSymbol(char symbol){
        text.append(symbol);
        System.out.println(text.toString());
    }

    public void deleteLastSymbol(){
        text.deleteCharAt(text.length() - 1);
        System.out.println(text.toString());
    }

    public boolean isOn() {
        return isOn;
    }
}
