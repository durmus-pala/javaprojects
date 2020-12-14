package com.company;

 class Hamburger{
     private double basicPrice;
     private String name;
     private String breadRollType;
     private String meat;
     private int lettuce;
     private int carrot;
     private int tomato;
     private int onion;

     public Hamburger(double basicPrice, String name, String breadRollType, String meat) {
         this.basicPrice = basicPrice;
         this.name = name;
         this.breadRollType = breadRollType;
         this.meat = meat;
     }

     public double getPrice(){
         double totalPrice = this.basicPrice + ((this.lettuce * 0.2) + (this.carrot * 0.5) + (this.tomato * 0.7) + (this.onion * 0.8));
         return totalPrice;
     }

     public double getBasicPrice() {
         return basicPrice;
     }

     public int getLettuce() {
         return lettuce;
     }

     public int getCarrot() {
         return carrot;
     }

     public int getTomato() {
         return tomato;
     }

     public int getOnion() {
         return onion;
     }

     public void setLettuce(int lettuce) {
         this.lettuce = lettuce;
     }

     public void setCarrot(int carrot) {
         this.carrot = carrot;
     }

     public void setTomato(int tomato) {
         this.tomato = tomato;
     }

     public void setOnion(int onion) {
         this.onion = onion;
     }
 }

 class HealthyBurger extends Hamburger{

     private int dietSalt;
     private int dietCheese;

     public HealthyBurger(double basicPrice, String name, String breadRollType, String meat) {
         super(basicPrice, name, breadRollType, meat);

     }

     public int getDietSalt() {
         return dietSalt;
     }

     public void setDietSalt(int dietSalt) {
         this.dietSalt = dietSalt;
     }

     public int getDietCheese() {
         return dietCheese;
     }

     public void setDietCheese(int dietCheese) {
         this.dietCheese = dietCheese;
     }

     @Override
     public double getPrice() {
         double totalPrice = this.getBasicPrice() + ((this.getLettuce() * 0.2) +
                 (this.getCarrot() * 0.5) + (this.getTomato() * 0.7) + (this.getOnion() * 0.8) +
                 (this.dietCheese * 0.9) + (this.dietSalt * 0.5));
         return totalPrice;
     }

     @Override
     public int getLettuce() {
         return super.getLettuce();
     }

     @Override
     public int getCarrot() {
         return super.getCarrot();
     }

     @Override
     public int getTomato() {
         return super.getTomato();
     }

     @Override
     public int getOnion() {
         return super.getOnion();
     }

     @Override
     public void setLettuce(int lettuce) {
         super.setLettuce(lettuce);
     }

     @Override
     public void setCarrot(int carrot) {
         super.setCarrot(carrot);
     }

     @Override
     public void setTomato(int tomato) {
         super.setTomato(tomato);
     }

     @Override
     public void setOnion(int onion) {
         super.setOnion(onion);
     }
 }
 class DeluxeBurger extends Hamburger{
     private int drink;
     private int chips;

     public DeluxeBurger(double basicPrice, String name, String breadRollType, String meat, int drink, int chips) {
         super(basicPrice, name, breadRollType, meat);
         this.drink = drink;
         this.chips = chips;
     }

     @Override
     public double getPrice() {
         double totalPrice = this.getBasicPrice() + (this.chips * 2.5) + (this.drink * 3.5);
         return totalPrice;
     }
 }
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
