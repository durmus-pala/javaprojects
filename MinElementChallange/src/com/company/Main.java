package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Minimum Element is " + FindMin(ReadIntegers(10)));
    }

    private static int[] ReadIntegers(int count) {
        System.out.println("Enter " + count + " integer values.\r");
        int[] values = new int[count];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    private static int FindMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i= 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
