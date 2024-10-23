package interpreter;


import java.util.ArrayList;
import java.util.List;

public class Interpreter {
    public static Expression parse(String input) {
        String[] tokens = input.split(" ");
        Expression res = new NumberExpression(Integer.parseInt(tokens[0]));


        for (int i = 1; i < tokens.length; i += 2) {
            char operator = tokens[i].charAt(0);
            Expression right = new NumberExpression(Integer.parseInt(tokens[i + 1]));
            res = new OperationExpression(res, right, operator);
        }
        return res;
    }
}