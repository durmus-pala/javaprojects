package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        int finishnumber = 20;
        int count = 0;
        int sum = 0;
        while (number <= finishnumber){
            number++;
            if(isEvenNumber(number)){
                count++;
                sum += number;
                System.out.println("Even Nmuber " + number);
                if(count == 5){
                    System.out.println("Sum = " + sum);
                    break;
            }

            }

        }
//	int count = 6;
//	while(count != 5){
//        System.out.println("Count value is " + count);
//        count++;
//    }
//        do{
//            System.out.println("Count value is " + count);
//            count++;
//            if(count > 100){
//                break;
//            }
//    }while (count != 6);

    }
    public static boolean isEvenNumber(int num1){
while (num1 % 2 == 0){
    return true;
}
return false;
    }
}
