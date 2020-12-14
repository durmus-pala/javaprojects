package com.company;

public class SIBTest {
    public static final String owner;

    static {
        owner = "tim";
        System.out.println("SIBTest static initialization is called.");
    }

    public SIBTest() {
        System.out.println("SIB consructor is called.");
    }

    static {
        System.out.println("2nd initalization block called.");
    }

    public void someMethod(){
        System.out.println("someMethod called.");
    }

}
