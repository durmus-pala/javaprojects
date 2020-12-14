package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Names {
    private Scanner scanner = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<String>();

    public ArrayList<String> getNames() {
        return names;
    }

    public void addContactName(String name) {
        names.add(name);
    }

    public void printNameList() {
        System.out.println("You have " + names.size() + " people in your phone list.");

        for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1) + ". phone list is " + names.get(i));
        }
    }

    public void updateNameContact(String currentName, String newName){
        int position = findNameContact(currentName);
        if(position >= 0){
            updateNameContact(position, newName);
        }
    }
    private void updateNameContact(int position, String newName){
        names.set(position, newName);
        System.out.println((position + 1) + ". Name contact in your phone list is updated");
    }
    public void removeNameContact(String name) {
        int position = findNameContact(name);
        if (position >= 0) {
            removeNameContact(position);
        }
    }
    private void removeNameContact(int position){
        names.remove(position);
    }
    private int findNameContact(String serachName){
        //   boolean exists = names.contains(searchName);
        return names.indexOf(serachName);
    }
    public boolean onFile(String searchName){
        int position = findNameContact(searchName);
        if(position >= 0){
            return true;
        }
        else{
            return false;
        }
    }


}
