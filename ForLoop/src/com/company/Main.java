package com.company;

public class Main {

    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 1000; i++) {
            if (isPrime(i) == true) {
                j++;
                System.out.println(i + " asal sayıdır.");
            }
            if (j == 10) {
                System.out.println(j + " adet asal sayı bulundu!");
                break;
        }

        }
    }
//        System.out.println(j + "adet asal sayı bulundu!");


//        System.out.println("10.000 at the 2% interest = " + calculateInterest(10000.0, 2.0));
//        System.out.println("10.000 at the 3% interest = " + calculateInterest(10000.0, 3.0));
//        System.out.println("10.000 at the 4% interest = " + calculateInterest(10000.0, 4.0));
//        System.out.println("10.000 at the 5% interest = " + calculateInterest(10000.0, 5.0));
//        for(int i = 0; i < 5; i++){
//            System.out.println("Loop " + i + " Hello!");
//        }
//        for(int j = 2; j < 9; j++) {
//            System.out.println("10.000 at the " + j + "% interest = " + String.format("%.2f", calculateInterest(10000.0, j)));
//                }
//        System.out.println("**************************************************");
//        for(int j = 8; j > 1; j--){
//            System.out.println("10.000 at the " + j + "% interest = " + String.format("%.2f", calculateInterest(10000.0, j)));
//      }

    public static double calculateInterest(double amount, double InterestRate){
        return (amount * (InterestRate / 100));
    }
    public static boolean isPrime(int n){

        if(n == 1){
            return false;
        }
        for(int i = 2; i <= n / 2; i++){
            if(n % i == 0){
                return false;
            }
        }
                return true;
        }
}
