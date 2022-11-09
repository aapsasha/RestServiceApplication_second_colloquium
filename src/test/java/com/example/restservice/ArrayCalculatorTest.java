package com.example.restservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCalculatorTest {

    @Test
    void sum1() {
        double[] doubleArray = new double[10];
        for(int i =0; i < 10;++i){
            doubleArray[i] = 0;
        }
        double answer = ArrayCalculator.sum(doubleArray,10);
        assertEquals(0,answer);
    }
    @Test
    void sum2() {
        double[] doubleArray = new double[10];
        for(int i =0; i < 10;++i){
            doubleArray[i] = i;
        }
        double answer = ArrayCalculator.sum(doubleArray,10);
        double expectedAnswer = 0;
        for(int i =0; i < 10;++i){
            expectedAnswer += i;
        }
        assertEquals(expectedAnswer,answer);
    }
    @Test
    void sum3() {
        double[] doubleArray = new double[10];
        for(int i =0; i < 10;++i){
            doubleArray[i] = -i;
        }
        double answer = ArrayCalculator.sum(doubleArray,10);
        double expectedAnswer = 0;
        for(int i =0; i < 10;++i){
            expectedAnswer -= i;
        }
        assertEquals(expectedAnswer,answer);
    }

    @Test
    void dif1() {
        double[] doubleArray = new double[10];
        for(int i =0; i < 10;++i){
            doubleArray[i] = 0;
        }
        double answer = ArrayCalculator.dif(doubleArray,10);
        assertEquals(0,answer);
    }

    @Test
    void dif2() {
        double[] doubleArray = new double[10];
        for(int i =0; i < 10;++i){
            doubleArray[i] = i;
        }
        double answer = ArrayCalculator.dif(doubleArray,10);
        double expectedAnswer = 0;
        for(int i =1; i < 10;++i){
            expectedAnswer -= i;
        }
        assertEquals(expectedAnswer,answer);
    }

    @Test
    void dif3() {
        double[] doubleArray = new double[10];
        for(int i =0; i < 10;++i){
            doubleArray[i] = -i;
        }
        double answer = ArrayCalculator.dif(doubleArray,10);
        double expectedAnswer = 0;
        for(int i =1; i < 10;++i){
            expectedAnswer -= doubleArray[i];
        }
        assertEquals(expectedAnswer,answer);
    }
    @Test
    void mul1() {
        double[] doubleArray = new double[10];
        for(int i =0; i < 10;++i){
            doubleArray[i] = 0;
        }
        double answer = ArrayCalculator.mul(doubleArray,10);
        assertEquals(0,answer);
    }
    @Test
    void mul2() {
        double[] doubleArray = new double[10];
        for(int i =0; i < 10;++i){
            doubleArray[i] = i;
        }
        double answer = ArrayCalculator.mul(doubleArray,10);
        double expectedAnswer = 0;
        for(int i =0; i < 10;++i){
            expectedAnswer *= i;
        }
        assertEquals(expectedAnswer,answer);
    }

    @Test
    void mul3() {
        double[] doubleArray = new double[10];
        for(int i =0; i < 10;++i){
            doubleArray[i] = -i;
        }
        double answer = ArrayCalculator.mul(doubleArray,10);
        double expectedAnswer = 0;
        for(int i =0; i < 10;++i){
            expectedAnswer *= -i;
        }
        assertEquals(expectedAnswer,answer);
    }
    @Test
    void div1() {
        double[] doubleArray = new double[10];
        doubleArray[0] = 10;
        for(int i =1; i < 10;++i){
            doubleArray[i] = 1;
        }
        double expectedAnswer = 10;
        double answer = ArrayCalculator.div(doubleArray,10);
        assertEquals(expectedAnswer,answer);
    }
    @Test
    void div2() {
        double[] doubleArray = new double[10];
        doubleArray[0] = 10;
        for(int i =1; i < 10;++i){
            doubleArray[i] = 2;
        }
        double expectedAnswer = 10;
        for(int i =1; i < 10;++i){
            expectedAnswer /= 2;
        }
        double answer = ArrayCalculator.div(doubleArray,10);
        assertEquals(expectedAnswer,answer);
    }
    @Test
    void div3() {
        double[] doubleArray = new double[1];
        doubleArray[0] = 10;
        double expectedAnswer = 10;
        double answer = ArrayCalculator.div(doubleArray,1);
        assertEquals(expectedAnswer,answer);
    }
}