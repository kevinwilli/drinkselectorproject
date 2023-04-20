package edu.guilford;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class DrinkSelector 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        //Instantiate a Drink object
        Drink d = new Drink();
        System.out.println(d.getName());
        System.out.println(d.getPrice());
        System.out.println(d.getQuantity());
        System.out.println(d.getCalories());

        //Instantiate a Drink object with parameters
        Drink d2 = new Drink("Coke", 1.99, 20, 100);
        System.out.println(d2.getName());
        System.out.println(d2.getPrice());
        System.out.println(d2.getQuantity());
        System.out.println(d2.getCalories());

        //Instantiate a Drink object with parameters

        Drink d3 = new Drink("Sprite", 1.99, 20, 100);
        System.out.println(d3.getName());
        System.out.println(d3.getPrice());
        System.out.println(d3.getQuantity());
        System.out.println(d3.getCalories());

        //instantiate a Drink object with default constructor
        Drink drink = new Drink();
        System.out.println(drink);

        //instantiate an arraylist of drinks
        ArrayList<Drink> drinks = new ArrayList<>();
        drinks.add(d);
        
        //A loop that instantiates at least five objects and adds them (with the first object) to the array or ArrayList
        for (int i = 0; i < 5; i++) {
            Drink drink2 = new Drink();
            drinks.add(drink2);
        }
       
       // A loop that prints out all elements of the array or ArrayList
        for (Drink drink4 : drinks) {
            System.out.println(drink4);
        }
        
        //Some kind of analysis of the objects
        //The average price of all drinks
    
        double total = 0;
        for (Drink drink5 : drinks) {
            total += drink5.getPrice();
        }
        System.out.println("The average price of all drinks is " + total/drinks.size());
        //the average calories of all drinks
        double total2 = 0;
        for (Drink drink6 : drinks) {
            total2 += drink6.getCalories();
        }
        System.out.println("The average calories of all drinks is " + total2/drinks.size());
        //the average quantity of all drinks
        double total3 = 0;
        for (Drink drink7 : drinks) {
            total3 += drink7.getQuantity();
        }
        System.out.println("The average quantity of all drinks is " + total3/drinks.size());
    }

    
}
