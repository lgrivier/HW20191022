/*
 * This is a child class
 * Veggie toppings are always 1.00 each
 * 
 * need to calculate total cost with toppings
 */
package edu.hfcc;

public class VeggiePizza extends Pizza{
	
	private static final double VEGGIE_TOPPING_PRICE=1.00;
	
	@Override
	public double calculateTotalPizzaCost() {
		

		super.setTotalVeggiePrice(super.getToppings().size()*VEGGIE_TOPPING_PRICE);
		return super.calculateTotalPizzaCost();
	}

}
