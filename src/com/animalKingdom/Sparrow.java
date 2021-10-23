package com.animalKingdom;

public class Sparrow extends Bird implements Flyable {

	public Sparrow(int age, String gender, int weightInKilos) {
		super(age, gender, weightInKilos);
		
	}

	@Override
	public void fly() {
		System.out.println("Sparrow Flying...");
		
	}
	
//	public void fly() {
//		System.out.println("Sparrow Flying...");
//	}

}
