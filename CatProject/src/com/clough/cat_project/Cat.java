package com.clough.cat_project;

public class Cat {
	
	private String name;
	private String gender;
	private int age;
	private double weight;
	private boolean isAMouser;
	
	public Cat() {
		name = "";
		gender = "";
		age =0;
		weight = 0;
		isAMouser = true;
	}
	public Cat(String name, String gender, int age, double weight, boolean isAMouser) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.setAMouser(isAMouser);
		this.weight = weight;}

	
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		// TODO Auto-generated method stub
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
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
String str= "";
int numTimes = 1;
	public void meow(int numTimes) {

		for(int i=1; i <= numTimes; i++) {
			str =str + " Meow"; }
		//this.str= str;
		System.out.println(str + "!");
	}


}
