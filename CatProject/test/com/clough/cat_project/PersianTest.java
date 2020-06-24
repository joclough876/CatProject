package com.clough.cat_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PersianTest extends CatTest {
	
	private static Cat dimples;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		dimples = new Cat("Dimples", "female", 2, 3.09, true);
	}

	@Test
	void cat_GivenFiveParameters_ShouldConstructCat() {
		assertTrue(dimples instanceof Cat);
	}

}
