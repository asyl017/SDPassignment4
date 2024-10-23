import interpreter.Expression;
import interpreter.Interpreter;
import memento.History;
import memento.Memento;
import memento.TextEditor;
import observer.NewsAgency;
import observer.NewsChannel;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        testInterpreter();
        testMemento();
        testObserver();

    }

    public static void testInterpreter() {
        Expression expression = Interpreter.parse("5 + 2 - 3");
        System.out.println(expression.interpret());
    }

    public static void testMemento() {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.type("Hello. ");
        history.saveState(editor);


        editor.type("How are you?");
        history.saveState(editor);

        System.out.println("Current state:" +  editor.getText());



        history.undo(editor);
        System.out.println("Current state after undo:" +  editor.getText());


        history.undo(editor);
        System.out.println("Current state after Undo: " + editor.getText());

    }


    public static void testObserver(){
        NewsAgency agency = new NewsAgency();
        NewsChannel channel = new NewsChannel("HabarNews");
        NewsChannel channel1 = new NewsChannel("QazaqstanNews");

        agency.add(channel);
        agency.add(channel1);

        agency.setHeadline(" Elon Mask created flying cars ");
        agency.notifyObservers();
    }
}

