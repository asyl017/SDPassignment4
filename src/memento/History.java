package memento;

import java.util.Stack;

public class History {
    private Stack<Memento> historyStack = new Stack<>();

    public void saveState(TextEditor textEditor){
        historyStack.push(textEditor.save());
    }
    public void undo(TextEditor textEditor){
        if(!historyStack.isEmpty()){
            textEditor.restore(historyStack.pop());
        }
    }
}
