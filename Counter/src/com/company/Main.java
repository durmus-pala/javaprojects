package com.company;

public class Main {

    public static void main(String[] args) {
	Countdown countdown = new Countdown();

	CountdownThread countdownThread = new CountdownThread(countdown);
	countdownThread.setName("Thread 1");

	CountdownThread countdownThread1 = new CountdownThread(countdown);
	countdownThread1.setName("Thread 2");

	countdownThread.start();
	countdownThread1.start();

    }
}

class Countdown {

    private int i;

   // public synchronized void doCountdown()

    public void doCountdown(){
        String color;

        switch (Thread.currentThread().getName()){
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;
                break;
        }

        synchronized (this){
            for(i = 10; i > 0; i--){
                System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
            }
        }
    }

}

class CountdownThread extends Thread {
    private Countdown threadCountdown;

    public CountdownThread(Countdown countdown){
        threadCountdown = countdown;
    }

    public void run(){
        threadCountdown.doCountdown();
    }
}
