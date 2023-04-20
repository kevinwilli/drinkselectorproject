package edu.guilford;

import java.util.Random;

public class Drink {
    Random rand = new Random();
    //attributes
    private String name;
    private double price;
    private int quantity;
    private int calories;
    
    //constructors
    public Drink() {

        name = "Water";
        price = rand.nextDouble() * 10;
        quantity = rand.nextInt(100);
        calories = rand.nextInt(100)*5;
    }

    public Drink(String name, double price, int quantity, int calories) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.calories = calories;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    //toString
    @Override
    public String toString() {
        return "Drink{" + "name=" + name + ", price=" + price + ", quantity=" + quantity + ", calories=" + calories + '}';
    }
   

}
