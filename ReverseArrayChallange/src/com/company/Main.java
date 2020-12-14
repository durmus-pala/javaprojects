package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray ={12, 25, 36, 52, 45, 48, 66, 61, 72, 90, 92, 12, 18, 92, 77, 66};
        System.out.println("asıl dizi: " + Arrays.toString(myIntArray));
        reverse(myIntArray);
    }
    private static void reverse(int[] array){
        int[] array1 = new int[array.length];

        for(int i = 0; i < array.length; i++){
            array1[i] = array[array.length - 1 - i];
        }
        System.out.println("ters döndürülen dizi: " + Arrays.toString(array1));
    }
}
