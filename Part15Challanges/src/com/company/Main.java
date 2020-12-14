package com.company;

public class Main {

    public static void main(String[] args) {
        final BankAccount1 account = new BankAccount1("12345-678", 1000.00);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(300.00);
                account.withdraw(50.0);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(203.75);
                account.withdraw(100.0);
            }
        });

        thread1.start();
        thread2.start();
        System.out.println(account.getBalance());

    }
}


