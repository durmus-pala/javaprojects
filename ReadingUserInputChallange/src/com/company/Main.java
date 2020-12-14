package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (count < 10) {
            int order = count +1;
            System.out.println("Enter number" + order);
            boolean HasNextInt = scanner.hasNextInt();
            if (HasNextInt){
                count++;
                int number = scanner.nextInt();
                sum += number;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Sum of numbers are " + sum);
    }
}

