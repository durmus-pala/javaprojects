package com.company;

public class Vehicle {
    private int gear;
    private int move;
    private String steering;

    public Vehicle(int gear, int move, String steering) {
        this.gear = gear;
        this.move = move;
        this.steering = steering;
    }

    public int getGear() {
        return gear;
    }

    public int getMove() {
        return move;
    }

    public String getSteering() {
        return steering;
    }
}