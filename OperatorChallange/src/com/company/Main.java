package com.company;

public class Main {

    public static void main(String[] args) {

        double DoubleVariable = 20.00d;
        double SecondDoubleVariable = 80.00d;
        double result = (DoubleVariable + SecondDoubleVariable) * 100.00d;// (20+80)*100= 10000
        result = result % 40.00d;
        boolean BooleanVariable = (result == 0d) ? true : false;
        System.out.println("My Boolean Variable is " + BooleanVariable);
        if(!BooleanVariable){
            System.out.println("Got some remainder");
        }

    }
}
