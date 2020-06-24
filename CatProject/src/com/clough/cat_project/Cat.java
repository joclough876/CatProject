package com.clough.cat_project;

public class Cat {
	
	private String name;
	private String gender;
	private int age;
	private double weight;
	private boolean isAMouser;
	
	public Cat(String name, String gender, int age, double weight, boolean isAMouser) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.setAMouser(isAMouser);
		this.weight = weight;
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public String getGender() {
		// TODO Auto-generated method stub
		return gender;
	}

	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsAMouser() {
		// TODO Auto-generated method stub
		return isAMouser;
	}

	public Double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	public void setAMouser(boolean isAMouser) {
		this.isAMouser = isAMouser;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
