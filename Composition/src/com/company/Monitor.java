package com.company;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resulotion nativeResulotion;

    public Monitor(String model, String manufacturer, int size, Resulotion nativeResulotion) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResulotion = nativeResulotion;
    }
    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + ", " + y + " is colour " + color);
    }
}
