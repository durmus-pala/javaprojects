package com.company;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String eMail;
    private String phoneNumber;

    public BankAccount(){
        this("12345", 2.5, "default name", "default adress", "default phone");
        System.out.println("Empty constructor has made");
    }
    public BankAccount(String accountNumber, double balance, String customerName, String eMail, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String geteMail(){
        return this.eMail;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void seteMail(String eMail){
        this.eMail = eMail;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public double depositBalance(long deposit){
        balance += deposit;
        return this.balance;
    }
    public double withdrawBalance(long withdraw){
        if(balance < withdraw){
            System.out.println("Insufficent balance!!!");
        }if(balance > withdraw){
            balance -= withdraw;
            return this.balance;
        }
        return this.balance;

    }
}

