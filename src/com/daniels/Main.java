package com.daniels;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue=" + myIntValue);
        System.out.println("myFloatValue =" + myFloatValue);
        System.out.println("myDoubleValue =" + myDoubleValue);

        double myPound = 200d;
        double PoundKgConverter = (myPound * 0.45359237d);
        System.out.println("Kilograms =" + PoundKgConverter);
        double pi = 3.141_592_7d;
    }
}
