package com.company;

public class Main {

    public static void main(String[] args) {

        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String MyString = "This is a string";
        System.out.println("My String is equal to " + MyString );
         MyString = MyString + ", and this is more.";
        System.out.println("My String is equal to " + MyString);
        MyString = MyString + "\u00A9 2019";
        System.out.println("My String is equal to " + MyString);

        String NumberString = "250.55";
        NumberString = NumberString + "49.95";
        System.out.println(NumberString);

        String LastString = "10";
        int MyInt = 50;
        LastString = LastString + MyInt;
        System.out.println("My Last String is equals to " + LastString);
        double DoubleNumber = 120.47d;
        LastString = LastString + DoubleNumber;
        System.out.println("My Last String is equals to " + LastString);




    }
}
