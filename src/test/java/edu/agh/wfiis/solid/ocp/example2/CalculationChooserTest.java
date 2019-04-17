package edu.agh.wfiis.solid.ocp.example2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

@RunWith(JUnit4.class)
public class CalculationChooserTest {

    private final CalculationChooser underTest = new CalculationChooser();

    @Test
    public void shouldChooseAdditionWhenPlusOperatorPassed(){
        PerformingCalculations chosenCalculation = underTest.chooseCalculation("+");
        assertThat(chosenCalculation, instanceOf(Addition.class));
    }

    @Test
    public void shouldChooseSubtractionWhenMinusOperatorPassed() {
        PerformingCalculations chosenCalculation = underTest.chooseCalculation("-");
        assertThat(chosenCalculation, instanceOf(Subtraction.class));
    }

    @Test
    public void shouldChooseMultiplicationWhenAsteriskOperatorPassed() {
        PerformingCalculations chosenCalculation = underTest.chooseCalculation("*");
        assertThat(chosenCalculation, instanceOf(Multiplication.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldFailWhenUnsupportedOperatorPassed(){
        PerformingCalculations chosenCalculation = underTest.chooseCalculation("/");
    }

}
