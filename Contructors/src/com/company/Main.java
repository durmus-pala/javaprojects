package com.company;

public class Main {
    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount();
//        BankAccount Account1 = new BankAccount("1254789", 15000.0, "Durmuş PALA", "durmuspala48@gmail.com", "05300247930");
//        System.out.println(Account1.getBalance());
//        System.out.println(bankAccount.getCustomerName());
//        bankAccount.setAccountNumber("1254789");
//        bankAccount.setBalance(15000);
//        bankAccount.setCustomerName("Durmuş PALA");
//        bankAccount.seteMail("durmuspala48@gmail.com");
//        bankAccount.setPhoneNumber("0530 024 79 30");
//        System.out.println("Customer Name: " + bankAccount.getCustomerName());
//        System.out.println("Phone Number: " + bankAccount.getPhoneNumber());
//        System.out.println("eMail adress: " + bankAccount.geteMail());
//        System.out.println("Balance: " + bankAccount.getBalance());
//       bankAccount.depositBalance(12000);
//       System.out.println("New Balance: " + bankAccount.getBalance());
//        bankAccount.withdrawBalance(10000);
//        System.out.println("New Balance: " + bankAccount.getBalance());
//        bankAccount.withdrawBalance(200000);
//        System.out.println("New Balance: " + bankAccount.getBalance());
        VipCustomer customer1 = new VipCustomer();
        System.out.println("name: " + customer1.getName()+ " Credit limit: " + customer1.getCreditLimit()+ " Email: " + customer1.geteMail());
        VipCustomer customer2 = new VipCustomer("durmus", 150000.0);
        System.out.println("name: " + customer2.getName()+ " Credit limit: " + customer2.getCreditLimit()+ " Email: " + customer2.geteMail());
        VipCustomer customer3 = new VipCustomer("Zeynep", 500000.0, "durmuspala48@gmail.com");
        System.out.println("name: " + customer3.getName()+ " Credit limit: " + customer3.getCreditLimit()+ " Email: " + customer3.geteMail());


    }



    }
