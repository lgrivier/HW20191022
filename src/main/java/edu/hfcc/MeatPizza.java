/*
 * This is child class
 * Meat toppings are always 1.50 each
 * 
 * need to calculate total cost with toppings
 * 
 * 
 */
package edu.hfcc;

public class MeatPizza extends Pizza {
	
	private static final double MEAT_TOPPING_PRICE=1.50;

	
	@Override
	public double calculateTotalPizzaCost() {
	
		super.setTotalMeatPrice(super.getToppings().size()*MEAT_TOPPING_PRICE);
		return super.calculateTotalPizzaCost();
	}
	
}
