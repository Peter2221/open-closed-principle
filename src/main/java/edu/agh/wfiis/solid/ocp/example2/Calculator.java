package edu.agh.wfiis.solid.ocp.example2;

public class Calculator {

    public static void main(String[] args) {
        
          Operations operation = new Operations();		
          System.out.println(operation.doCalculation(args[1], args[0], args[2]));
    }
}