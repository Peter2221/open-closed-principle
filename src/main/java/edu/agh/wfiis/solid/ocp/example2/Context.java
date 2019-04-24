package edu.agh.wfiis.solid.ocp.example2;

public class Operations
{
	private static Map<String, doingCalculation> operation;

	public Operations()
	{
		operation = new HashMap<>();
		operation.put("+", new Addition());
		operation.put("-", new Subtraction());
	}
	
	public int doCalculation(String operator, int val1, int val2)
	{
		return operation.get(operator).doCalculation(val1, val2);
	}
}