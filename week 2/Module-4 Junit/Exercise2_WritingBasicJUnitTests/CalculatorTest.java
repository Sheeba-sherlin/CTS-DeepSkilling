import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {

        assertEquals(5, calculator.add(2,3));

    }

    @Test
    public void testSubtraction() {

        assertEquals(2, calculator.subtract(5,3));

    }

    @Test
    public void testMultiplication() {

        assertEquals(6, calculator.multiply(2,3));

    }

}