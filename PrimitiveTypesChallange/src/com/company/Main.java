package com.company;

public class Main {

    public static void main(String[] args) {

        byte MyByteVariable = 10;
        short MyShortVariable = 20;
        int MyIntVariable = 50;
        long MyLongVariable = 50000L + 10L * (MyByteVariable + MyShortVariable + MyIntVariable);
        System.out.println(MyLongVariable);
        short ShortTotal = (short) (1000 + 10 * (MyByteVariable + MyIntVariable + MyShortVariable));

    }
}
