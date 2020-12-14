package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of the digits are " + SumDigits(47));
    }
    public static int SumDigits(int number){
        int sum = 0;
        if(number < 10){
            return -1;
        }
        while (number > 0){
            int last = number % 10;
            sum += last;
            number = number / 10;
        }
        return sum;
    }
}
