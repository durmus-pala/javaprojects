package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

import static com.company.Main.EOF;

public class Main {

    public static final String EOF = "EOF";

    public static void main(String[] args) {
        List<String> buffer = new ArrayList<String>();
        ReentrantLock bufferlock = new ReentrantLock();

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_YELLOW, bufferlock);
        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE, bufferlock);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN, bufferlock);

//        new Thread(producer).start();
//        new Thread(consumer1).start();
//        new Thread(consumer2).start();

        executorService.execute(producer);
        executorService.execute(consumer1);
        executorService.execute(consumer2);

        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(ThreadColor.ANSI_WHITE + "I'm printed for the Callable class.");
                return "this is the Callable result";
            }
        });

        try{
            System.out.println(future.get());
        }catch (ExecutionException e){
            System.out.println("Something went wrong");
        }catch (InterruptedException e){
            System.out.println("Thread running the task was interrupted");
        }

        executorService.shutdown();
    }
}

class MyProducer implements Runnable {

    private List<String> buffer;
    private String color;
    private ReentrantLock bufferlock;

    public MyProducer(List<String> buffer, String color, ReentrantLock bufferlock) {
        this.buffer = buffer;
        this.color = color;
        this.bufferlock = bufferlock;
    }

    public void run() {
        Random random = new Random();
        String[] nums = {"1", "2", "3", "4", "5"};

        for (String num : nums) {
            try {
                System.out.println(color + " Adding... " + num);
                //synchronized (buffer){
                bufferlock.lock();
                try {
                    buffer.add(num);
                } finally {
                    bufferlock.unlock();
                }
                //}

                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                System.out.println("Producer was interrupted.");
            }
        }
        System.out.println(color + " Adding EOF and exiting...");
        // synchronized (buffer){
        bufferlock.lock();
        try {
            buffer.add("EOF");
        } finally {
            bufferlock.unlock();
        }
        //}
    }
}

class MyConsumer implements Runnable {
    private List<String> buffer;
    private String color;
    private ReentrantLock bufferlock;

    public MyConsumer(List<String> buffer, String color, ReentrantLock bufferlock) {
        this.buffer = buffer;
        this.color = color;
        this.bufferlock = bufferlock;
    }

    @Override
    public void run() {
        int counter = 0;
        while (true) {
            //bufferlock.lock();
            if (bufferlock.tryLock()) {
                try {
                    //synchronized (buffer){
                    if (buffer.isEmpty()) {
                        continue;
                    }
                    System.out.println(color + "The counter= " + counter);
                    counter = 0;
                    if (buffer.get(0).equals(Main.EOF)) {
                        System.out.println(color + " Exiting");
                        break;
                    } else {
                        System.out.println(color + " Removed " + buffer.remove(0));
                    }
                    //}
                } finally {
                    bufferlock.unlock();
                }
            } else {
                counter++;
            }
        }
    }
}

