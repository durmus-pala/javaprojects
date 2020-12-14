package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private static Scanner scanner = new Scanner(System.in);
    private static Names names = new Names();

public static void functionalities(){
    boolean quit = false;
    int choice = 0;
    printInstructions();
    while(!quit){
        System.out.println("Enter your Choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice){
            case 0:
                printInstructions();
                break;
            case 1:
                names.printNameList();
                break;
            case 2:
                addNewNameContact();
                break;
            case 3:
                updateName();
                break;
            case 4:
                removeName();
                break;
            case 5:
                searchForName();
                break;
            case 6:
                quit = true;
                break;
        }
    }
}
    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of name contacts");
        System.out.println("\t 2 - To add a new name to list");
        System.out.println("\t 3 - To update a name contact in the list");
        System.out.println("\t 4 - To remove a name from the list");
        System.out.println("\t 5 - To search for a name from the list");
        System.out.println("\t 6 - To quit the application");
    }
    public static void addNewNameContact(){
        System.out.print("Please enter the new name contact: ");
        names.addContactName(scanner.nextLine());
    }
    public static void updateName(){
        System.out.print("Please enter current name: ");
        String contactName = scanner.nextLine();
        System.out.print("Please enter replacement name: ");
        String newContactName= scanner.nextLine();
        names.updateNameContact(contactName, newContactName);
    }
    public static void removeName(){
        System.out.print("Please enter name: ");
        String contactName = scanner.nextLine();
        names.removeNameContact(contactName);
    }
    public static void searchForName(){
        System.out.print("Please enter name to search for: ");
        String searchName = scanner.nextLine();
        if(names.onFile(searchName)){
            System.out.println("Found " + searchName + " in your phone list.");
        }
        else{
            System.out.println(searchName + " is not in your phone list.");
        }
    }
    public static void processArraylist(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(names.getNames());

        ArrayList<String> nextArray = new ArrayList<String>(names.getNames());

        String[] myArray = new String[names.getNames().size()];
        myArray = names.getNames().toArray(myArray);
    }
}
