package com.cts.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorService();

    @Test
    public void testAddition() {

        // Arrange
        int num1 = 10;
        int num2 = 20;

        // Act
        int result = calculatorService.add(num1, num2);

        // Assert
        assertEquals(30, result);

    }

}