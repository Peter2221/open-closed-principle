package edu.agh.wfiis.solid.ocp.example2;

public class SubstractValuesCalculation implements CalculationStrategy {
    @Override
    public int doCalculation(int val1, int val2){
        return val1 - val2;
    }
}

