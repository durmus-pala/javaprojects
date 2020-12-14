package com.company;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("comodore")) {
            this.model = model;
        }else{
            this.model = "Unkonown";
        }
    }
        public String getModel(){
            return this.model;
        }
    }

