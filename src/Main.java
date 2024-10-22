import interpreter.Expression;
import interpreter.Interpreter;

public class Main {
    public static void main(String[] args) {
        testInterpreter();

    }

    public static void testInterpreter() {
        Expression expression = Interpreter.parse("5 + 2 - 3");
        System.out.println(expression.interpret());
    }
}

