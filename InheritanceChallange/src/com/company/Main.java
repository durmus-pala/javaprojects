package com.company;

public class Main {

    public static void main(String[] args) {
	Vehicle vehicle = new Vehicle(3, 50, "right");
	Car car = new Car(2, 40, "left");
        System.out.println(vehicle.getGear());
        System.out.println(car.getMove());

    }
}
