package memento;

public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public Memento save() {
        return new Memento(text.toString());
    }

    public void restore(Memento memento) {
        text = new StringBuilder(memento.getState());
    }

    public void type(String word) {
        text.append(word);
    }

    public String getText() {
        return text.toString();
    }
}
