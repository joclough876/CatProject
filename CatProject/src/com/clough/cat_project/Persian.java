package com.clough.cat_project;

public class Persian extends Cat {

	private String name;
	private String gender;
	private int age;
	private double weight;
	private boolean isAMouser;
	
	public Persian(String name, String gender, int age, double weight, boolean isAMouser) {
		super(name, gender, age, weight, isAMouser);
		// TODO Auto-generated constructor stub
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
		this.isAMouser = isAMouser;
	}

}
