package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String eMail;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String geteMail() {
        return eMail;
    }

    public VipCustomer(){
        this.name = "default name";
        this.creditLimit = 50000.0;
        this.eMail = "default adress";
    }
    public VipCustomer(String name, double creditLimit){
        this.name = name;
        this.creditLimit = creditLimit;
        this.eMail = "default adress";
    }
    public VipCustomer(String name, double creditLimit, String eMail){
        this.name = name;
        this.creditLimit = creditLimit;
        this.eMail = eMail;

    }
}
