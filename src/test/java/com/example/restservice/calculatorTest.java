package com.example.restservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    @Test
    void sum1() {
        double a = 3.7;
        double b = 7.4;
        double expectedAnswer = a + b;
        double answer  = Calculator.sum(a,b);
        assertEquals(expectedAnswer,answer);
    }

    @Test
    void sum2() {
        double a = 0;
        double b = 2;
        double expectedAnswer = a + b;
        double answer  = Calculator.sum(a,b);
        assertEquals(expectedAnswer,answer);
    }

    @Test
    void sum3() {
        double a = -3;
        double b = 5;
        double expectedAnswer = a + b;
        double answer  = Calculator.sum(a,b);
        assertEquals(expectedAnswer,answer);
    }

    @Test
    void sum4() {
        double a = Double.MAX_VALUE;
        double b = Double.MIN_VALUE;
        double expectedAnswer = a + b;
        double answer  = Calculator.sum(a,b);
        assertEquals(expectedAnswer,answer);
    }
    @Test
    void multiplication1() {
        double a = 0;
        double b = 1.1;
        double expectedAnswer = a * b;
        double answer  = Calculator.multiplication(a,b);
        assertEquals(expectedAnswer,answer);
    }

    @Test
    void multiplication2() {
        double a = -34.5;
        double b = 22.2;
        double expectedAnswer = a * b;
        double answer  = Calculator.multiplication(a,b);
        assertEquals(expectedAnswer,answer);
    }

    @Test
    void multiplication3() {
        double a = -12.1;
        double b = -67;
        double expectedAnswer = a * b;
        double answer  = Calculator.multiplication(a,b);
        assertEquals(expectedAnswer,answer);
    }
    @Test
    void multiplication4() {
        double a = 0;
        double b = -0;
        double expectedAnswer  = a * b;
        double answer  = Calculator.multiplication(a,b);
        assertEquals(expectedAnswer,answer);
    }

    @Test
    void difference1() {
        double a = 0;
        double b = 1.8;
        double expectedAnswer = a - b;
        double answer  = Calculator.difference(a,b);
        assertEquals(expectedAnswer,answer);
    }

    @Test
    void difference2() {
        double a = 1.1;
        double b = -10.4;
        double expectedAnswer = a - b;
        double answer  = Calculator.difference(a,b);
        assertEquals(expectedAnswer,answer);
    }
    @Test
    void difference3() {
        double a = Double.MAX_VALUE;
        double b = Double.MAX_VALUE;
        double expectedAnswer = a - b;
        double answer  = Calculator.difference(a,b);
        assertEquals(expectedAnswer,answer);
    }

    @Test
    void difference4() {
        double a = 0;
        double b = 0.234;
        double expectedAnswer = a - b;
        double answer  = Calculator.difference(a,b);
        assertEquals(expectedAnswer,answer);
    }

    @Test
    void division1() {
        double a = 0;
        double b = 1;
        double expectedAnswer = a / b;
        double answer  = Calculator.division(a,b);
        assertEquals(expectedAnswer,answer);
    }
    @Test
    void division2() {
        double a = -4.2;
        double b = 1;
        double expectedAnswer = a / b;
        double answer  = Calculator.division(a,b);
        assertEquals(expectedAnswer,answer);
    }
    @Test
    void division3() {
        double a = 23.0;
        double b = -3444.111;
        double expectedAnswer = a / b;
        double answer  = Calculator.division(a,b);
        assertEquals(expectedAnswer,answer);
    }
    @Test
    void division4() {
        double a = Double.MAX_VALUE;
        double b = Double.MAX_VALUE;
        double expectedAnswer = a / b;
        double answer  = Calculator.division(a,b);
        assertEquals(expectedAnswer,answer);
    }
}