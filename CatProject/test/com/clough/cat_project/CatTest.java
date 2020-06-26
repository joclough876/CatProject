package com.clough.cat_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
//import static org.junit.ass
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ArrayTest{
	//String[] meows = {"Meow", "Meow"};
	
}
class CatTest {
	String meows[];
	String catsounds = " Meow";
	private static ArrayTest arr;
	private static Cat felix;
	private static Cat a;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		felix = new Cat("Felix", "male", 6, 6.78, true);
		//a = new Cat.meow(3);
		arr = new ArrayTest();
		//System.out.print(felix.meow(2));
	}

	@Test
	//<method under test>_<GivenParameters>_<Result You expect>()
	void cat_GivenFiveParameters_ShouldConstructCat() {
		assertTrue(felix instanceof Cat);
		assertEquals("Felix", felix.getName());
		assertEquals("male", felix.getGender());
		assertEquals(6, felix.getAge());
		assertNotEquals("Jodi", felix.getName());
		assertEquals(true, felix.getIsAMouser());
		assertNotEquals(5.45, felix.getWeight());
		//assertNotEquals(catsounds, felix.meow(3));
		
	}

	
}
