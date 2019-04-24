package edu.agh.wfiis.solid.ocp.example2;

public class NoOperationException extends Exception{
  String operation;

  public NoOperationException(String operation){
    this.operation = operation;
  }

  public String toString(){
    return "No operation of this type - " + operation;
  }
}
