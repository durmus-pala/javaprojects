package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");

        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i +1) + ". grocery list is " + groceryList.get(i));
        }
    }
    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }
    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }
    public void removeItem(String Item) {
        int position = findItem(Item);
        if (position >= 0) {
            removeItem(position);
        }
    }
    private void removeItem(int position){
        groceryList.remove(position);
    }
    private int findItem(String searchItem){
     //   boolean exists = groceryList.contains(searchItem);
            return groceryList.indexOf(searchItem);
        }
        public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }
        else{
            return false;
        }
        }
    }
