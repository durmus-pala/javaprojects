package com.company;

import java.util.ArrayList;
import java.util.Arrays;

class IntClass{
    private int myIntValue;

    public IntClass(int myIntValue) {
        this.myIntValue = myIntValue;
    }

    public int getMyIntValue() {
        return myIntValue;
    }

    public void setMyIntValue(int myIntValue) {
        this.myIntValue = myIntValue;
    }
}

public class Main {

    public static void main(String[] args) {
	String[] strArray = new String[10];
	int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Tim");

       // ArrayList<int> intArrayList = new ArrayList<int>(); int prmitive type olduğu için hata verir. Bir sınıf olması gerekir.
        ArrayList<IntClass> intArrayList = new ArrayList<IntClass>();
        intArrayList.add(new IntClass(54));
        Integer integer = new Integer(35);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList1 = new ArrayList<Integer>();
        for(int i = 0; i<= 10; i++){
            intArrayList1.add(Integer.valueOf(i));
        }

        for(int i = 0; i<= 10; i++){
            System.out.println(i + " --> " + intArrayList1.get(i));
        }
        Integer myIntValue = 56;//Integer.valueOf(56);
        int myInt = myIntValue.intValue();//myInt.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();

        for(double dbl = 0.0; dbl<=10.0; dbl+= 0.5){
            myDoubleValues.add(dbl); // myDoubleValues.add(Double.valueOf(i))
        }
        for (int i = 0; i<myDoubleValues.size(); i++){
            System.out.println(i + " --> " + myDoubleValues.get(i));
        }
    }
}
