package edu.agh.wfiis.solid.ocp.example2;

public class Subtraction implements doingCalculation
{
	@Override
	public int doCalculation(int val1, int val2)
	{
		return val1 - val2;
	}
}