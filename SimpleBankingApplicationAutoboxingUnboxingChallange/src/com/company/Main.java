package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank Akbank = new Bank();

    public static void main(String[] args) {
        boolean quit = false;
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    Akbank.printBranches();
                    break;

                case 2:
                    printCustomers();
                    break;

                case 3:
                    addNewBranch();
                    break;

                case 4:
                    addNewCustomerToExistingBranch();
                    break;

                case 5:
                    addNewTransactionToAnExistingCustomer();
                    break;

                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to print branches\n" +
                "2  - to print customers in a branch and their transactions\n" +
                "3  - to add a new branch\n" +
                "4  - to add a new customer to an existing branch\n" +
                "5  - to add a new transaction to an existing customer\n" +
                "6  - print the avaliable actions\n");
        System.out.println("Choose your action: ");
    }

    public static void printCustomers() {
        System.out.println("Enter Branch name: ");
        String branchName = scanner.nextLine();
        if (Akbank.findBranch(branchName) >= 0) {
            System.out.println("Enter a customer name: ");
            String customerName = scanner.nextLine();
            System.out.println("Enter this customer's transactions: ");
            ArrayList<Double> customerTransactions = new ArrayList<Double>();
            customerTransactions.add(scanner.nextDouble());
            Customer customer3 = Customer.createNewCustomer(customerName, customerTransactions);
            ArrayList<Customer> customer4 = new ArrayList<Customer>();
            customer4.add(customer3);
            System.out.println("Customer List in this branch");
            for (int i = 0; i < customer4.size(); i++) {
                for (int j = 0; j < customer4.get(i).getTransactions().size(); j++) {
                    System.out.println((i + 1) + "." +
                            customer4.get(i).getName() + ":\n" +
                            "Transactions: " + customer4.get(i).getTransactions().get(j));
                }
            }
        } else {
            System.out.println("This branch is not found!");
        }
    }

    private static void addNewBranch() {
        System.out.println("Enter new Branch name: ");
        String branchName = scanner.nextLine();
        System.out.println("Enter a customer name: ");
        String customerName = scanner.nextLine();
        ArrayList<Double> customerTransactions = new ArrayList<Double>();
        System.out.println("Enter this customer's transactions: ");
        double transaction = scanner.nextDouble();
        customerTransactions.add(transaction);
        Customer customer1 = Customer.createNewCustomer(customerName, customerTransactions);
        ArrayList<Customer> customer2 = new ArrayList<Customer>();
        Branches.addNewCustomer(customer1);
        Branches newBranch = Branches.createNewBranch(branchName, customer2);
       if (Akbank.addNewBranch(newBranch)) {
            System.out.println("New Branch added: Branch name = " + branchName);
            for (int i = 0; i < customer2.size(); i++) {
                for (int j = 0; j < customer2.get(i).getTransactions().size(); j++) {
                    System.out.println((i + 1) + "." +
                            customer2.get(i).getName() + ":\n" +
                            "Transactions: " + customer2.get(i).getTransactions().get(j));
                }
            }
        } else {
            System.out.println("Cannot add, " + branchName + " already on file");
        }
    }

    public static void addNewCustomerToExistingBranch() {
        System.out.println("Enter Branch name: ");
        String branchName = scanner.nextLine();
        if (Akbank.findBranch(branchName) >= 0) {
            System.out.println("Enter a customer name: ");
            String customerName = scanner.nextLine();
            ArrayList<Double> customerTransactions = new ArrayList<Double>();
            System.out.println("Enter this customer's transactions: ");
            double transaction = scanner.nextDouble();
            scanner.nextLine();
            customerTransactions.add(transaction);
            Customer customer5 = Customer.createNewCustomer(customerName, customerTransactions);
            ArrayList<Customer> customer6 = new ArrayList<Customer>();
            if (!customer5.getName().equals(customerName)) {
                customer6.add(customer5);
                System.out.println(customer5.getName() + "added. Transactions are: ");
                for (int j = 0; j < customer5.getTransactions().size(); j++) {
                    System.out.println(customer5.getTransactions().get(j));
                }
            } else {
                System.out.println("Cannot add, " + customerName + " already on file");
            }
        } else {
            System.out.println("This branch is not found!");
        }
    }

    public static void addNewTransactionToAnExistingCustomer() {
        System.out.println("Enter Branch name: ");
        String branchName = scanner.nextLine();
        if (Akbank.findBranch(branchName) >= 0) {
            System.out.println("Enter a customer name: ");
            String customerName = scanner.nextLine();
            ArrayList<Double> customerTransactions = new ArrayList<Double>();
            Customer customer7 = Customer.createNewCustomer(customerName, customerTransactions);
            ArrayList<Customer> customer8 = new ArrayList<Customer>();
            if (customer7.getName().equals(customerName)) {
                double newTransaction = scanner.nextDouble();
                scanner.nextLine();
                customer7.getTransactions().add(newTransaction);
            } else {
                System.out.println(customerName + " not found.");
            }
        } else {
            System.out.println(branchName + " not found.");
        }
    }
}

