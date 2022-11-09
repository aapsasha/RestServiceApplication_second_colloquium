package com.example.restservice;
// Design Pattern Facade
public class Calculator {
    public static double sum(double a, double b){
        double[] doubleArray = new double[2];
        doubleArray[0] = a;
        doubleArray[1] = b;
        return ArrayCalculator.sum(doubleArray,2);
    }
    public static double multiplication(double a,double b){
        double[] doubleArray = new double[2];
        doubleArray[0] = a;
        doubleArray[1] = b;
        return ArrayCalculator.mul(doubleArray,2);
    }
    public static double difference(double a, double b){
        double[] doubleArray = new double[2];
        doubleArray[0] = a;
        doubleArray[1] = b;
        return ArrayCalculator.dif(doubleArray,2);
    }
    public static double division(double a, double b){
        double[] doubleArray = new double[2];
        doubleArray[0] = a;
        doubleArray[1] = b;
        return ArrayCalculator.div(doubleArray,2);
    }
}
