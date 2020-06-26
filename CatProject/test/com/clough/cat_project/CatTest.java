package com.clough.cat_project;

import static org.junit.jupiter.api.Assertions.*;

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
	@Test
	
	void meow_GivenNumTimes_PrintToConsoleNumTimesOfMeows()
	{felix.meow(2);
		
	}
	
	@Test
	void meow_GivenString_IsTrue() {
		assertTrue("meow".equals(felix.meow("meow", 10)));
		assertEquals("meow", felix.meow("meow", 8));
	}
	
	@Test
	void meow_GivenStringAndSize_ShouldReturnArrayOfStrings() {
		int length = 10;
		String catreply = "meow";
		String[] strings = felix.meow(catreply, length);
		assertEquals(length, strings.length);
		for(int i=0; i<length; i++) {
			assertEquals(catreply, strings);
		}
		
	}
	}

