
package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    public void testSumWithNegativeNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(-2, -3);
        assertEquals(-5, result, "-2 + -3 should equal -5");
    }

    @Test
    public void testSumWithZero() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(0, 5);
        assertEquals(5, result, "0 + 5 should equal 5");
    }
}
