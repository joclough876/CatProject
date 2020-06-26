package com.clough.cat_project;

public class CatSteerer {

	public static void main(String [] args) {
		
		Persian dimples = new Persian("Dimples", "female", 4, 20, true);
		BritishShortHair garfield = new BritishShortHair("Garfield", "male", 8, 60.76, true);
		Cat tabby = new Cat("Tabby", "male", 2, 23, true);

		garfield.meow(5);
		tabby.meow(10);
		dimples.meow(3);
	}

}
