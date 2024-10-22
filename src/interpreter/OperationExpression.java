package interpreter;

public class OperationExpression implements Expression {

    private Expression value1;
    private Expression value2;
    private char operation;

    public OperationExpression(Expression value1,Expression value2,char operation) {
        this.value1 = value1;
        this.value2 = value2;
        this.operation = operation;
    }

    @Override
    public int interpret() {
        switch (operation) {
            case '+':
                return value1.interpret() + value2.interpret();
            case '-':
                return value1.interpret() - value2.interpret();
            default:
                throw new UnsupportedOperationException("No such operation " + operation);
        }
    }
}
