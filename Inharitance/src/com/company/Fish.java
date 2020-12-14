package com.company;

public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, brain, body, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void rest(){

    }
    private void moveMuscles(){

    }
    private void moveBackfin(){

    }
    private void swim(){
        moveMuscles();
        moveBackfin();
        super.move(5);

    }
}
