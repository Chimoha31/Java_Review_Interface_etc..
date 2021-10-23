package com.animalKingdom;

public class Zoo {

	public static void main(String[] args) {
		
//		Animalにabstractを使用した場合、インスタンスは作れない。下記エラーになる。
//		Animal animal = new Animal(12, "Male", 20);
//		animal.move();
		
//		Bird classにはAnimalをextensionしているから
//		Bird classに何もメソッド書いていなくてもAnimalで書いたメソッドを使用可能。
		Bird bird = new Bird(12, "Male", 20);
		moveAnimal(bird);
		
		Sparrow sparrow = new Sparrow(30, "Female", 28);
		sparrow.fly();
		
		Chicken chicken = new Chicken(15, "Female", 5);
		moveAnimal(chicken);
		
		Fish fish = new Fish(6, "unknown", 79);
		moveAnimal(fish);
		
		
	}
	
//	Polymorphism
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
