package edu.agh.wfiis.solid.ocp.example2;

public class ExpressionParser{


    public static int getLeftValue(String[] expression){
    return Integer.valueOf(expression[0]);
  }

  public static int getRightValue(String[] expression){
    return Integer.valueOf(expression[2]);
  }

  public static Calculating getOperation(String[] expression) throws NoOperationException{
      Calculating operation = OperationsManager.getOperation(expression[1]);
      return operation;
  }
}
