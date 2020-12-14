package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
          int myIntValue = 10;
          int anotherIntValue = myIntValue;

        System.out.println("My int Value = " + myIntValue);
        System.out.println("Another int value = " + anotherIntValue);

        anotherIntValue++;
        System.out.println("My int Value = " + myIntValue);
        System.out.println("Another int value = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        System.out.println("My int array = " + Arrays.toString(myIntArray));
        System.out.println("Another array = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("After change My int array = " + Arrays.toString(myIntArray));
        System.out.println("After Change Another array = " + Arrays.toString(anotherArray));

        anotherArray = new int[] {4, 5, 6, 7, 8};
        modifyArray(myIntArray);
        System.out.println("After method change My int array = " + Arrays.toString(myIntArray));
        System.out.println("After method Change Another array = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array){

        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
