package com.company;

public class Main {

    public static void main(String[] args) {
Main.calcFeetAndInchesToCentimeters(13, 1);
Main.calcFeetAndInchesToCentimeters(25);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if((feet < 0) || (inches < 0 || inches > 12)){
            System.out.println("one or both parametr(s) are invalid");
            return -1;
        }else{
            double centimeters = (double)((2.54 * inches) + (feet * 30.48));
            System.out.println(feet + " feets and " + inches + " inches = " + centimeters + " centimeters");
            return centimeters;
        }
            }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            System.out.println("Invalid Value");
            return -1;
        }else{
            double feet = (double) (inches / 12);
            System.out.println(inches + " inches = " + feet + " feet");
            return inches;
        }
    }
}
