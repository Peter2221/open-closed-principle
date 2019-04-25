package edu.agh.wfiis.solid.ocp.example2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CalculatorTest {

    private final Calculator underTest = new Calculator();

    @Test
    public void shouldAddValues(){
        int result = underTest.calculate(new String[]{"1", "+", "2"}, new ConsolePrinter());
        Assert.assertEquals(3,result);
    }

    @Test
    public void shouldSubtractValues(){
        int result = underTest.calculate(new String[]{"1", "-", "2"}, new ConsolePrinter());
        Assert.assertEquals(-1,result);
    }

    @Test
    public void shouldMultiplyValues() {
        int result = underTest.calculate(new String[]{"3", "*", "5"}, new ConsolePrinter());
        Assert.assertEquals(15, result) ;
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldFailWhenUnsupportedOperandPassed(){
        underTest.calculate(new String[]{"1", "/", "2"}, new ConsolePrinter());
    }
}
