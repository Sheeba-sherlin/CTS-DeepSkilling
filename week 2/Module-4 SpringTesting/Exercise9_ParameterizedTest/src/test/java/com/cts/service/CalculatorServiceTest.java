package com.cts.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorServiceTest {

    CalculatorService service =
            new CalculatorService();

    @ParameterizedTest

    @CsvSource({

            "2,3,5",

            "10,20,30",

            "5,5,10",

            "100,200,300"

    })

    public void testAddition(int a,int b,int expected){

        assertEquals(expected,

                service.add(a,b));

    }

}