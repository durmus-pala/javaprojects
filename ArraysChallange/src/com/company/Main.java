package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

       // printArray(getIntegers(5));
        printArray(sortIntegers(getIntegers(5)));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++){
           values[i] = scanner.nextInt();
        }
        return values;
    }
    public static void printArray(int[] array){
        for(int i = 0; i< array.length; i++){
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
    public static int[] sortIntegers(int[] values2){
//        System.out.println("Enter " + number2 + " integer values.\r");
//        int[] values2 = new int[number2];
//        for(int i = 0; i < values2.length; i++){
//            values2[i] = scanner.nextInt();
 //       }

        int n = values2.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(values2[j] < values2[j+1]){
                    int temp = values2[j];
                    values2[j] = values2[j+1];
                    values2[j+1] = temp;
                }
            }
        }
        return values2;
    }
}
