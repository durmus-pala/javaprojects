package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        boolean first = true;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter number");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                if(first){
                    first = false;
                    min = number;
                    max = number;
                }

                if(number > max){
                    max = number;
                }if(number < min){
                     min = number;
                }
            }else{
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Max value = " + max);
        System.out.println("Min value = " + min);
    }
}
