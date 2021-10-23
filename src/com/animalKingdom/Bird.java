package com.animalKingdom;

public class Bird extends Animal {
	
	public Bird(int age, String gender, int weightInKilos) {
		super(age, gender, weightInKilos);
	}
	
//	override from Animal。Animalでmove()は定義したが、(Animalをextendsしているのでこの説明)
//	ここでmove()メソッドをまた定義したらもちろんこちらが優先される。
//	@override
	public void move() {
		System.out.println("Flapping wings...");
	}

}
