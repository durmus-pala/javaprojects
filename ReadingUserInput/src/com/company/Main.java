package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            int old = 2019 - yearOfBirth;
            System.out.println("Enter your name: ");
            String name =scanner.nextLine();
            if(old >= 0 && old <= 100){
                System.out.println("Your name is " + name + " and you are " + old + " years old.");
            }else{
                System.out.println("Invalid Year of birth");
            }
        }else{
            System.out.println("Unable to parse year of birth");
        }
        scanner.close();
    }
}
