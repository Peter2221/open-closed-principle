package edu.agh.wfiis.solid.ocp.example2;

import java.util.HashMap;
import java.util.Map;

public class CalculationChooser {

    private static final Map<String, PerformingCalculations> CALCULATIONS_BY_OPERATORS = new HashMap<>();

    static {
        CALCULATIONS_BY_OPERATORS.put("+", new Addition());
        CALCULATIONS_BY_OPERATORS.put("-", new Subtraction());
        CALCULATIONS_BY_OPERATORS.put("*", new Multiplication());
    }

    public static PerformingCalculations chooseCalculation(String operator) {
        PerformingCalculations chosenCalculation = CALCULATIONS_BY_OPERATORS.get(operator);
        if (chosenCalculation != null) {
            return chosenCalculation;
        }
        else {
            throw new IllegalArgumentException(operator + " is not supported");
        }
    }
}
