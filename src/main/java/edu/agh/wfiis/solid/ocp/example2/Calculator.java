package edu.agh.wfiis.solid.ocp.example2;

public class Calculator {

    public int calculate(String[] expression) throws NoOperationException {

        Calculating calculation = ExpressionParser.getOperation(expression);
        int resultOfCalculation = calculation.calculate(ExpressionParser.getLeftValue(expression), ExpressionParser.getRightValue(expression));

        return resultOfCalculation;
    }

    public static void main(String[] args) throws NoOperationException {
        Calculator calculator = new Calculator();
        calculator.calculate(args);
    }
}

