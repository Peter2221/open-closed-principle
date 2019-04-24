package edu.agh.wfiis.solid.ocp.example2;

import java.util.HashMap;

public class Calculator {
    private HashMap<String, Calculable> mapOfOperations;

    public Calculator(){
        this.mapOfOperations = new HashMap<>();
        mapOfOperations.put("+", new AddValues());
        mapOfOperations.put("-", new SubstractValues());
        mapOfOperations.put("*", new MultiplyValues());
    }
    
    public int calculate(String[] args) {
        int leftOperand = Integer.parseInt(args[0]);
        int rightOperand = Integer.parseInt(args[2]);
        String operator = args[1];

        int result;
        if (!this.mapOfOperations.containsKey(operator)) {
            throw new IllegalArgumentException(operator + " is not supported");
        }

        Calculable strategy = mapOfOperations.get(operator);
        result = strategy.doCalculation(leftOperand, rightOperand);
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(args));
    }
}
