package com.company;

public class Main {

    public static void main(String[] args) {
	String NumberAsString = "2019.125";
        System.out.println("Nmuber as String = " + NumberAsString);

        double number = Double.parseDouble(NumberAsString);
        System.out.println("Number = " + NumberAsString);

        NumberAsString += 1;
        number += 1;
        System.out.println("Number as string = " + NumberAsString);
        System.out.println("Number = " + number);
    }
}
