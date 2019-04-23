package edu.agh.wfiis.solid.ocp.example2;

import java.util.HashMap;

public class Calculator {
    private HashMap<String, CalculationStrategy> mapOfOperations;

    public Calculator(){
        this.mapOfOperations = new HashMap<>();
        mapOfOperations.put("+", new AddValuesCalculation());
        mapOfOperations.put("-", new SubstractValuesCalculation());
        mapOfOperations.put("*", new MultiplyValuesCalculation());
    }
    
    public int calculate(String[] args) {
        int val1 = Integer.valueOf(args[0]);
        int val2 = Integer.valueOf(args[2]);
        String operator = args[1];

        int result;
        if (!this.mapOfOperations.containsKey(operator)) {
            throw new IllegalArgumentException(operator + " is not supported");
        }

        CalculationStrategy strategy = mapOfOperations.get(operator);
        result = strategy.doCalculation(val1, val2);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate(args);
    }
}
