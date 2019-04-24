package edu.agh.wfiis.solid.ocp.example2;

public class SubstractValues implements Calculable {
    @Override
    public int doCalculation(int leftOperand, int rightOperand){
        return leftOperand - rightOperand;
    }
}

