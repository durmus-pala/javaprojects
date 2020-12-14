package com.company;


import java.sql.SQLOutput;

public class Main {

    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
	new Thread1().start();
	new Thread2().start();
    }
    private static class Thread1 extends Thread {

        public void run(){
            synchronized (lock1){
                System.out.println("Thread 1: Has lock1");
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){

                }
                System.out.println("Thread 1 waiting for lock2");
                synchronized (lock2){
                    System.out.println("Thread 1: Has lock1 and lock2");
                }
                System.out.println("Thread 1: released lock2");
            }
            System.out.println("Thread 1 : Released lock1 exiting...");
        }
    }
    private static class Thread2 extends Thread {

        public void run(){
            synchronized (lock1){
                System.out.println("Thread 2: Has lock 1");
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){

                }
                System.out.println("Thread 2 Waiting for lock 2");
                synchronized (lock2){
                    System.out.println("Thread 2: Has lock 1 and lock 2");
                }
                System.out.println("Thread 2: Released lock 2.");
            }
            System.out.println("Thread 2: Released lock 1. Exiting...");
        }
    }
}


