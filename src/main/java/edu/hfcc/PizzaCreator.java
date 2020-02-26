/*
 * This program calculates the total price the pizza based open varying toppings and delivery
 * 
 * Remember to right the most 
   Use proper scope
   Create constants
   Naming of Variables and methods
   Make sure to use annotations
   Use this and super when necessary
   
   Pizza is the Base Class
   While CheesePizza, MeatPizza and VeggiePizza are Child classes
 	
 */

package edu.hfcc;

import java.util.List;

public class PizzaCreator {
	
	public double execute(Pizza pizza, List<String> toppings,
			boolean deliverPizza) {
		
		//Base Class needs to set delivery
		pizza.setDeliverPizza(deliverPizza);
		//Base Class needs to set toppings
		pizza.setToppings(toppings);
		//call method to calculate total cost of pizza
		return pizza.calculateTotalPizzaCost();
		
		
	}

}
