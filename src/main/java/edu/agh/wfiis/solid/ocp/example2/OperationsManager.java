package edu.agh.wfiis.solid.ocp.example2;

import java.util.Map;
import java.util.HashMap;

public class OperationsManager{

  private static Map<String, Calculating> operations;

  static{

    operations = new HashMap<>();
    operations.put("+", new Addition());
    operations.put("-", new Substraction());
    operations.put("*", new Multiplicaltion());

  }

  public static Calculating getOperation(String mathSymbol) throws NoOperationException {

    Calculating operation = operations.get(mathSymbol);

    if(operation != null)
      return operation;
    
    throw new NoOperationException(mathSymbol);
  }
}
