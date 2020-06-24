package com.clough.cat_project;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.ass
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CatTest {
	private static Cat felix;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		felix = new Cat("Felix", "male", 6, 6.78, true);
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
		
	}


}
