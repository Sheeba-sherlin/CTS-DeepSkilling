import static org.junit.Assert.assertEquals;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;

public class CalculatorAAATest {

    Calculator calculator;

    @Before
    public void setUp(){

        calculator = new Calculator();

        System.out.println("Setup Completed");

    }

    @After
    public void tearDown(){

        System.out.println("Cleanup Completed");

    }

    @Test
    public void testAddition(){

        // Arrange

        int a = 20;

        int b = 10;

        // Act

        int result = calculator.add(a,b);

        // Assert

        assertEquals(30,result);

    }

}