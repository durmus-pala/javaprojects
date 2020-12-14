package com.company;

import java.util.ArrayList;

public class Branches {

   private String branchName;
    private ArrayList<Customer> bankCustomer;

    public Branches(String branchName, ArrayList<Customer> bankCustomer) {
        this.branchName = branchName;
        this.bankCustomer = bankCustomer;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getBankCustomer() {
        return bankCustomer;
    }

    public boolean addNewCustomer(Customer customer) {
        if(findCustomer(customer.getName()) >=0) {
            System.out.println("Customer is already on file");
            return false;
        }

        bankCustomer.add(customer);
        return true;
    }
    public Customer addNewTransaction(String customerName, double newTransaction){
        for(int i=0; i<this.bankCustomer.size(); i++) {
            Customer customer = this.bankCustomer.get(i);
            if(customer.getName().equals(customerName)) {
                customer.getTransactions().add(newTransaction);
            }
            return customer;
        }
        return null;
    }

   public int findCustomer(Customer customer) {
        return this.bankCustomer.indexOf(customer);
    }

    public int findCustomer(String customerName) {
        for(int i=0; i<this.bankCustomer.size(); i++) {
            Customer customer = this.bankCustomer.get(i);
            if(customer.getName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }
    public static  Branches createNewBranch(String branchName, ArrayList<Customer> bankCustomer){
        return new Branches (branchName, bankCustomer);
    }

}
