package com.clough.cat_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

 class BritishShortHairTest {
	
	 //public BritishShortHairTest(String name, String gender, int age, double weight, boolean isAMouser) {
		 //super(name, gender, age, weight, isAMouser);
	 
	 //}
	private static BritishShortHair garfield;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		
		garfield = new BritishShortHair("Garfield", "male", 10, 20.75, false);
	}

	@Test
	void cat_GivenFiveParameters_ShouldConstructCat(){
		assertTrue(garfield instanceof BritishShortHair);
	}

}
