package edu.hfcc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class PizzaCreatorTest {
    @Test 
    public void verifyCheesePizzaNoDelivery() {
    	
    	Pizza cheesePizza = new CheesePizza();
    	List<String> toppings = new ArrayList();
    	double actual = new PizzaCreator().execute(cheesePizza, toppings,
    			false);
    	
    	assertEquals(5.00, actual);
       
    }
    
    @Test 
    public void verifyCheesePizzaWithDelivery() {
    	
    	Pizza cheesePizza = new CheesePizza();
    	List<String> toppings = new ArrayList();
    	double actual = new PizzaCreator().execute(cheesePizza, toppings,
    			true);
    	
    	assertEquals(8.5, actual);
       
    }
    
    @Test 
    public void verifyMeatPizzaNoDelivery() {
    	
    	Pizza meatPizza = new MeatPizza();
    	List<String> toppings = new ArrayList();
    	toppings.add("Bacon");
    	toppings.add("Pepperoni");
    	double actual = new PizzaCreator().execute(meatPizza, toppings, false);
    	
    	assertEquals(8.0, actual);
       
    }
    
    @Test 
    public void verifyMeatPizzaWithDelivery() {
    	
    	Pizza meatPizza = new MeatPizza();
    	List<String> toppings = new ArrayList();
    	toppings.add("Bacon");
    	double actual = new PizzaCreator().execute(meatPizza, toppings, true);
    	
    	assertEquals(10.0, actual);
    }
    
    @Test 
    public void verifyVeggiePizzaNoDelivery() {
    	
    	Pizza veggiePizza = new VeggiePizza();
    	List<String> toppings = new ArrayList();
    	toppings.add("Murshroom");
    	toppings.add("Onion");
    	toppings.add("Green Pepper");
    	double actual = new PizzaCreator().execute(veggiePizza, toppings, false);
    	
    	assertEquals(8.0, actual);
       
    }
    
    @Test 
    public void verifyVeggiePizzaWithDelivery() {
    	
    	Pizza veggiePizza = new VeggiePizza();
    	List<String> toppings = new ArrayList();
    	toppings.add("Murshroom");
    	toppings.add("Onion");
    	toppings.add("Green Pepper");
    	toppings.add("Hot Peppers");
    	double actual = new PizzaCreator().execute(veggiePizza, toppings, true);
    	
    	assertEquals(12.5, actual);
       
    }
}
