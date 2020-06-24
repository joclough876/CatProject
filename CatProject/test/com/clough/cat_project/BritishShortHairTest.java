package com.clough.cat_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BritishShortHairTest extends CatTest{
	String gender;
	int age;
	double weight;
	Boolean isAMouser;
	String name;

	private static Cat garfield;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//super(name, gender, age, weight, isAMouser);
		//thisname.name;
		garfield = new Cat("Garfield", "male", 10, 20.75, false);
	}

	@Test
	void cat_GivenFiveParameters_ShouldConstructCat(){
		assertTrue(garfield instanceof Cat);
	}

}
