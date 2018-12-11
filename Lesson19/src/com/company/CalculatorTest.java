package com.company;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testFactOn7() {
        int expected = 5040;
        int actual = calc.fact(7);
        assertEquals(expected, actual);
    }

    @Test
    public void testFactOn1() {
        int expected = 1;
        int actual = calc.fact(1);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactOnNegative() {
        calc.fact(-1);
    }

    @Test
    public void testIsSquareOn4() {
        assertTrue(calc.isSquare(4));
    }

    @Test
    public void testIsSquareOn42() {
        assertFalse(calc.isSquare(42));
    }

}
