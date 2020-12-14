package com.company;

import org.w3c.dom.ls.LSOutput;

class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, boolean engine, int cylinders, int wheels) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine(){
        return "Engine Was Started!!!";
    }
    public String accelerate(){
        return "Car speed is rising up!!!";
    }
    public String brake(){
        return "Car was stopped!!!";
    }
}
class Cadillac extends Car{
    public Cadillac() {
        super("Cadillac", true, 8, 4);
    }

    @Override
    public String startEngine() {
        return "Cadillac started loudly!!";
    }

    @Override
    public String accelerate() {
        return "Cadillac accelerates loudly!!";
    }
}
class Hyundai extends Car{
    public Hyundai() {
        super("Hyundai", true, 4, 4);
    }

    @Override
    public String startEngine() {
        return "Hyundai started like a bee!!";
    }

    @Override
    public String brake() {
        return "Hyundai stopped easily!!";
    }
}
class Chevrolet extends Car{
    public Chevrolet() {
        super("Chevrolet", true, 12, 4);
    }

    @Override
    public String accelerate() {
        return "Chevrolet accelerated like a monster!!";
    }

    @Override
    public String brake() {
        return "Chevrolet stopped like an animal!!";
    }
}

public class Main {

    public static void main(String[] args) {
	for(int i = 1; i < 6; i++){
        Car car = RandomCar();
        System.out.println("Random car: " +  car.getName() +  "\n" + "Engine: " + car.isEngine() + "\n"
                + "Number of Cylinders: " + car.getCylinders() + "\n" + "Number of wheels: " + car.getWheels() + "\n"
                + car.startEngine() + "\n" +  car.accelerate() + "\n" +  car.brake() + "\n");
    }
    }
    public static Car RandomCar(){
        int randomCar = (int) (Math.random() * 3) + 1;
        System.out.println("Random number was: " + randomCar);
        switch (randomCar){
            case 1:
                return new Cadillac();
            case 2:
                return new Hyundai();
            case 3:
                return new Chevrolet();
        }
        return null;
    }
}
