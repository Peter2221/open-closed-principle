package edu.agh.wfiis.solid.ocp.example2;

public class Calculator {

    public int calculate(String[] inputData) {
        MathOperation mathOperation = MathOperationParser.parse(inputData);

        Calculating calculation = CalculationChooser.chooseCalculation(mathOperation.getOperator());
        int result = calculation.calculate(mathOperation.getLhsValues(), mathOperation.getRhsValue());

        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate(args);
    }
}
