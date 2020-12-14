package com.company;

public class Main {

    public static void main(String[] args) {

        int MyValue = 10000;
        int MyMinIntValue = Integer.MIN_VALUE;
        int MyMaxIntValue = Integer.MAX_VALUE;
        System.out.println("minimum int value:" + MyMinIntValue);
        System.out.println("Maximum int value:" + MyMaxIntValue);
        System.out.println("My Busted max value:" + (MyMaxIntValue + 1));
        System.out.println("My Busted min value:" + (MyMinIntValue - 1));

        Byte MyMinByteValue = Byte.MIN_VALUE;
        Byte MyMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Max Byte Value:" + MyMaxByteValue);
        System.out.println("Min Byte Value" + MyMinByteValue);

        Short MyMinShortValue = Short.MIN_VALUE;
        Short MyMaxShortValue = Short.MAX_VALUE;
        System.out.println("Max Short Value:" + MyMaxShortValue);
        System.out.println("Min Short Value" + MyMinShortValue);

        long MyLongValue = 100L;
        Long MyMinLongValue = Long.MIN_VALUE;
        Long MyMaxLongValue = Long.MAX_VALUE;
        System.out.println("Max Long Value:" + MyMaxLongValue);
        System.out.println("Min Long Value" + MyMinLongValue);
        long BigLongLiteralValue = 2147483648L;
        System.out.println(BigLongLiteralValue);

        Short BigShortLiteralValue = 32767;

        int MyTotal = (MyMinIntValue / 2);

        byte MyNewByteValue = (byte) (MyMinByteValue / 2);
        short MyNewShortValue = (short) (MyMinShortValue /2);



    }
}
