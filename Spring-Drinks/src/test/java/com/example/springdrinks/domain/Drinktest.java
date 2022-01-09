package com.example.springdrinks.domain;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class Drinktest {
	
	@Test 
	public void testEquals() {
		EqualsVerifier.forClass(Drink.class).usingGetClass().verify();
		
	}
	
	@Test
	public void noIdConstructor() {
		Drink drink = new Drink("Foster", "Lager", 4, 30000, 11);
		
		assertNotNull(drink.getName());
		assertNotNull(drink.getType());
		assertNotNull(drink.getAlcoholicPercentage());
		assertNotNull(drink.getCalories());
		assertNotNull(drink.getCarbohydrates());
		
		assertEquals(drink.getName(), "Foster");
		assertEquals(drink.getType(), "Lager");
		assertEquals(drink.getAlcoholicPercentage(), 4);
		assertEquals(drink.getCalories(), 30000);
		assertEquals(drink.getCarbohydrates(), 11);
		
	}
		
		@Test
		public void settersTest() {
			Drink drink = new Drink();
			
			drink.setName("Kronenburg");
			drink.setType("Lager");
			drink.setAlcoholicPercentage(5);
			drink.setCalories(44000);
			drink.setCarbohydrates(15);
			
			
			assertNotNull(drink.getName());
			assertNotNull(drink.getType());
			assertNotNull(drink.getAlcoholicPercentage());
			assertNotNull(drink.getCalories());
			assertNotNull(drink.getCarbohydrates());
			
			assertEquals(drink.getName(), "Kronenburg");
			assertEquals(drink.getType(), "Lager");
			assertEquals(drink.getAlcoholicPercentage(), 5);
			assertEquals(drink.getCalories(), 44000);
			assertEquals(drink.getCarbohydrates(), 15);
			
			
			
		
		
	}

}
