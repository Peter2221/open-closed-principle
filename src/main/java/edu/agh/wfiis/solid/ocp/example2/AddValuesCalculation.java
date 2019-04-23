package edu.agh.wfiis.solid.ocp.example2;

public class AddValuesCalculation implements CalculationStrategy {
    @Override
    public int doCalculation(int val1, int val2){
        return val1 + val2;
    }
}
