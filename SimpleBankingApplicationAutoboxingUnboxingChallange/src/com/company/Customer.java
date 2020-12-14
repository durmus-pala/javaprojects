package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();


    public Customer(ArrayList<Double> transactions, String name) {
        this.transactions = transactions;
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public static  Customer createNewCustomer(String name, ArrayList<Double> transactions){
        return new Customer (transactions, name);
    }
}
