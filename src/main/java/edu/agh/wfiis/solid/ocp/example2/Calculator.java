package edu.agh.wfiis.solid.ocp.example2;

public class Calculator {

    public int calculate(String[] args) {
        int val1 = Integer.valueOf(args[0]);
        int val2 = Integer.valueOf(args[2]);
        String operator = args[1];

        PerformingCalculations calculation = CalculationChooser.chooseCalculation(operator);
        int result = calculation.calculate(val1, val2);

        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate(args);
    }
}
