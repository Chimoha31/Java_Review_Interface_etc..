package com.animalKingdom;

public abstract class Animal{
	
	 int age;
	 String gender;
	 int weightInKilos;

//	defaultのconstructor(parameterなし)
	public Animal() {
		this.age = 2;
		this.gender = "unknown";
		this.weightInKilos = 4;
	}
//constructor(parameterあり）
	public Animal(int age, String gender, int weightInKilos) {
		super();
		this.age = age;
		this.gender = gender;
		this.weightInKilos = weightInKilos;
	}


	
	public void eat() {
		System.out.println("Eating...");
	}
	
	public void sleep() {
		System.out.println("Sleeping...");
	}
	
	public abstract void move();
	
}
