package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TriangleNumberCalcTest {

    private TriangleNumberCalc calculator;

    @BeforeEach
    void setUp() {
        calculator = new TriangleNumberCalc();
    }

    @Test
    public void testValueOf1() {
        assertEquals(1, calculator.value(1), "Triangular number of 1 should be 1");
    }

    @Test
    public void testValueOf5() {
        assertEquals(15, calculator.value(5), "Triangular number of 5 should be 15");
    }

    @Test
    public void testValueOf7() {
        assertEquals(28, calculator.value(7), "Triangular number of 7 should be 28");
    }

    @Test
    public void testValueOf0() {
        assertEquals(0, calculator.value(0), "Triangular number of 0 should be 0");
    }

    @Test
    public void testValueOfNegativeNumber() {
        assertEquals(0, calculator.value(-5), "Triangular number of a negative number should be 0");
    }

    @Test
    public void testAdd5And7() {
        assertEquals(43, calculator.add(5, 7), "Addition of T(5) and T(7) should be 43");
    }

    @Test
    public void testAdd3And4() {
        assertEquals(16, calculator.add(3, 4), "Addition of T(3) and T(4) should be 16");
    }

    @Test
    public void testAdd0And5() {
        assertEquals(15, calculator.add(0, 5), "Addition of T(0) and T(5) should be 15");
    }

    @Test
    public void testAddNegativeAndPositive() {
        assertEquals(6, calculator.add(-3, 3), "Addition of T(-3) and T(3) should be 6");
    }

    @Test
    public void testSubtract7And5() {
        assertEquals(13, calculator.subtract(7, 5), "Subtraction of T(7) and T(5) should be 13");
    }

    @Test
    public void testSubtract4And3() {
        assertEquals(3, calculator.subtract(4, 3), "Subtraction of T(4) and T(3) should be 3");
    }

    @Test
    public void testSubtract5And0() {
        assertEquals(15, calculator.subtract(5, 0), "Subtraction of T(5) and T(0) should be 15");
    }

    @Test
    public void testSubtract3And5() {
        assertEquals(-9, calculator.subtract(3, 5), "Subtraction of T(3) and T(5) should be -9");
    }

    @Test
    public void testSubtractNegativeAndPositive() {
        assertEquals(-6, calculator.subtract(-3, 3), "Subtraction of T(-3) and T(3) should be -6");
    }
}
