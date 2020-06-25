package com.clough.cat_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PersianTest extends CatTest {
	
	private static Persian dimples;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		dimples = new Persian("Dimples", "female", 2, 3.09, true);
	}

	@Test
	void cat_GivenFiveParameters_ShouldConstructCat() {
		assertTrue(dimples instanceof Persian);
		assertEquals("Dimples", dimples.getName());
		assertEquals("female", dimples.getGender());
		assertEquals(2, dimples.getAge());
		assertNotEquals("Jodi", dimples.getName());
		assertEquals(true, dimples.getIsAMouser());
		assertNotEquals(5.45, dimples.getWeight());
	}

}
