package interpreter;

public class NumberExpression implements Expression {
    private int readonly_numbers;

    public NumberExpression(int numbers) {
        this.readonly_numbers = numbers;
    }

    @Override
    public int interpret() {
        return readonly_numbers;
    }
}
