package com.company;

public class BankAccount1 {

    private String accountNumber;
    private double balance;


    public BankAccount1(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public synchronized void deposit(double amount){
        balance += amount;
    }

    public synchronized void withdraw(double amount){
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber(){
        System.out.println("Account Number = " + accountNumber);
    }
}
