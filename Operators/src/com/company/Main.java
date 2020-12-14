package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1+2=3
        System.out.println("1+2= " + result);
        int PreviousResult = result;
        System.out.println("Previous result = " + result);
        result = result - 1; // 3-1 = 2
        System.out.println("3-1= " + result); // 3-1=2
        System.out.println("Previous result = " + PreviousResult);

        result = result * 10; // 2*10 = 20
        System.out.println("2*10= " + result);
        result = result / 5; // 20/5=4
        System.out.println("20/5= " + result);
        result = result % 3; // 4%3= 1
        System.out.println("4%3= " + result);
        result++; // 1+1=2
        System.out.println("1+1= " + result);
        result--; // 2-1=1
        System.out.println("2-1= " + result);
        // result = result + 2
        result += 2;
        System.out.println("1+2= " + result);
        // result= result * 10
        result *= 10; // 3*10 =30
        System.out.println("3*10= " + result);
        // result = result/3
        result /= 3; //30/3=10
        System.out.println("30/3= " + result);
        // result = result - 2
        result -= 2; // 10-2=8
        System.out.println("10-2= " + result);

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared Aliens!");
        }

        int TopScore = 80;
        if(TopScore < 100){
            System.out.println("You got the high score!");
        }
        int SecondTopScore = 95;
        if((SecondTopScore < TopScore) && (TopScore <100)){
            System.out.println("Greater than second top score and less than 100!");
        }
        if((TopScore > 90) || (SecondTopScore <= 90)){
            System.out.println("Either or both conditions are true!");
        }

        int NewValue = 50;
        if(NewValue == 50){
            System.out.println("This is true");
        }
        boolean isCar = false;
        if(isCar){
            System.out.println("This is not supposed to happen");
        }
        isCar = true;
        boolean WasCar = isCar ? true : false;
        if(WasCar){
            System.out.println("WasCar is true");
        }








}
}

