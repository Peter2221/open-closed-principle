package edu.agh.wfiis.solid.ocp.example2;

public class Context
{
	private doingCalculation operation;

	public Context(doingCalculation operation)
	{
		this.operation = operation;
	}
	
	public int doCalculation(int val1, int val2)
	{
		return operation.doCalculation(val1, val2);
	}
}