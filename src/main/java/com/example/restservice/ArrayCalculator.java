package com.example.restservice;

public class ArrayCalculator {
    public static double sum(double[] doubleArray,int size){
        double answer = 0;
        for(int i =0;i < size;++i){
            answer += doubleArray[i];
        }
        return answer;
    }
    public static double dif(double[] doubleArray, int size){
        double answer = doubleArray[0];
        for(int i =1;i < size;++i){
            answer -= doubleArray[i];
        }
        return answer;
    }
    public static double mul(double[] doubleArray,int size){
        double answer = 1;
        for(int i =0;i < size;++i){
            answer *= doubleArray[i];
        }
        return answer;
    }
    public static double div(double[] doubleArray,int size){
        double answer = doubleArray[0];
        for(int i =1;i < size;++i){
            if(doubleArray[i] == 0){
                throw new IllegalArgumentException();
            }
            answer /= doubleArray[i];
        }
        return answer;
    }
}
