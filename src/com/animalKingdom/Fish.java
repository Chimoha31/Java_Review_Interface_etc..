package com.animalKingdom;

public class Fish extends Animal{
	
	public Fish(int age, String gender, int weightInKilos) {
		super(age, gender, weightInKilos);
	}

	@Override
	public void move() {
		System.out.println("Fish is swimming...");
		
	}
}
