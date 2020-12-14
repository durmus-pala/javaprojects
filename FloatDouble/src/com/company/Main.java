package com.company;

import com.sun.jdi.Value;

public class Main {

    public static void main(String[] args) {

        float MyMinFloatValue = Float.MIN_VALUE;
        float MyMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Minimum float value = " + MyMinFloatValue);
        System.out.println("Maximum float vvalue = " + MyMaxFloatValue);

        double MyMinDoubleValue = Double.MIN_VALUE;
        double MyMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Minimum double value = " + MyMinDoubleValue);
        System.out.println("Maximum double value = " + MyMaxDoubleValue);

        int MyIntValue  = 5 / 3;
        float MyFloatValue = 5f / 3f;
        double MyDoubleValue = 5.00 / 3.00;

        System.out.println("My Int Value =" + MyIntValue);
        System.out.println("My Float Value =" + MyFloatValue);
        System.out.println("My Double Value =" + MyDoubleValue);


    }
}
