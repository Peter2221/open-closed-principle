package edu.agh.wfiis.solid.ocp.example2;

public class Calculator {

    public int calculate(int leftOperand, int rightOperand, String operator){
        if("+".equals(operator)){
            return leftOperand + rightOperand;
        }else if("-".equals(operator)){
            return leftOperand - rightOperand;
        }
        throw new IllegalArgumentException(operator +" is not supported");
    }

    public static void main(String[] args)
    {
        int val1 = Integer.valueOf(args[0]);
        int val2 = Integer.valueOf(args[2]);
        String operator = args[1];

        Calculator calculator = new Calculator();
        int result = calculator.calculate(val1, val2, operator);
        System.out.print(result);
    }
}
