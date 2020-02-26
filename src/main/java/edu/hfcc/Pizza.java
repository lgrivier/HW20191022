/*
 * This is a base class
 * 
 * plain cheese pizza is always 5.00
 * delivery charge is always 3.50
 * 
 * 
 * Need a method to calculate totalCostForPizza NO PARAMETERS but returns double

 		Will need other field variable and methods
 */
package edu.hfcc;

import java.util.List;

public class Pizza {
	private static final double PLAIN_CHEESE = 5.00;
	private static final double DELIVERY_CHARGE = 3.50;
	private double totalCheesePrice;
	private double totalVeggiePrice;
	private double totalMeatPrice;
	private boolean deliverPizza;
	private List<String>toppings;
	
	// ToppingsList get/set
	
	protected List<String> getToppings() {
		return toppings;
	}

	protected void setToppings(List<String> toppings) {
		this.toppings = toppings;
	}

	// Delivery Boolean get/set
	
	protected boolean isDeliverPizza() {
		return deliverPizza;
	}

	protected void setDeliverPizza(boolean deliverPizza) {
		this.deliverPizza = deliverPizza;
	}
	
	// Total Cheese Price get/set
	
	protected double getTotalCheesePrice() {
		return totalCheesePrice;
	}

	protected void setTotalCheesePrice(double totalCheesePrice) {
		this.totalCheesePrice = totalCheesePrice;
	}

	// Total Veggie Price get/set
	
	protected double getTotalVeggiePrice() {
		return totalVeggiePrice;
	}

	protected void setTotalVeggiePrice(double totalVeggiePrice) {
		this.totalVeggiePrice = totalVeggiePrice;
	}

	// Total Meat Price get/set
	
	protected double getTotalMeatPrice() {
		return totalMeatPrice;
	}

	public void setTotalMeatPrice(double totalMeatPrice) {
		this.totalMeatPrice = totalMeatPrice;
	}

	// Method to Calculate Total Pizza Cost
	
	public double calculateTotalPizzaCost() {
		
		double totalCharge=0;
		
		totalCharge = PLAIN_CHEESE +  this.totalVeggiePrice + this.totalMeatPrice;
		
		if(this.isDeliverPizza()) {
			totalCharge += DELIVERY_CHARGE;
		}
		
		return totalCharge;
	}
	
	

}
