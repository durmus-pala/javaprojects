package com.example.company;

import java.util.ArrayList;
import java.util.Scanner;
import com.example.game.Monster;
import com.example.game.ISaveable;
import com.example.game.Player;

public class Main {

    public static void main(String[] args) {

        com.example.game.Player tim = new com.example.game.Player("Tim", 10, 15);
        System.out.println(tim.toString());

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("stormbringer");
        savedObject(tim);
       // loadObject(tim);
        System.out.println(tim);

        com.example.game.ISaveable wereWolf = new com.example.game.Monster("wereWolf", 20, 40);
        System.out.println(wereWolf);
        savedObject(wereWolf);
        System.out.println("Strength for wereWolf: " + ((com.example.game.Monster) wereWolf).getStrength());//interface olduğu için casting yapmalıyız.
                                                                                           // monster sınıfına yaptığımız gibi.


    }
    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        System.out.println("Choose\n" +
                "1 - to enter a string\n" +
                "0 - to quit");
        while (!quit){
            System.out.print("Choose an action: ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a String: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
    public static void savedObject(com.example.game.ISaveable objectToSave){
        for(int i = 0; i< objectToSave.write().size(); i++){
            System.out.println("Saving: " + objectToSave.write().get(i) + " to storage device");
        }
    }
    public static void loadObject(com.example.game.ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
