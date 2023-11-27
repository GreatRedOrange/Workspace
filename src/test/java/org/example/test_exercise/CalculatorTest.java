package org.example.test_exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void sum() {
        int sum = calculator.sum(10, 20);
        Assertions.assertEquals(30, sum);
    }

    @Test
    void evenOrOdd() {
        boolean even = calculator.evenOrOdd(8);
        Assertions.assertTrue(even);
    }

    @Test
    void evenOrOdd_addNumber() {
        boolean odd = calculator.evenOrOdd(7);
        Assertions.assertFalse(odd);
    }
}
