package com.company;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("was not 1 or 2");
//        }
//        int SwitchValue = 5;
//        switch (SwitchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Value vas 3 or 4 or 5");
//                System.out.println("Actually it was " + SwitchValue);
//                break;
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//        }
        char CValue = 'F';
        switch(CValue){
            case 'A':
                System.out.println("A is found");
                break;
            case 'B':
                System.out.println("B is found");
                break;
            case 'C':
                System.out.println("C is found");
                break;
            case 'D':
                System.out.println("D is found");
                break;
            case 'E':
                System.out.println("E is found");
                break;
            default:
                System.out.println("Not found");
                break;
        }
        String month = "jAnuary";
        switch (month.toUpperCase()){
            case "JANUARY":
                System.out.println("Jan");
                break;
            case "JUNE":
                System.out.println("June");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
