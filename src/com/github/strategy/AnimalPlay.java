package com.github.strategy;

public class AnimalPlay {

	public static void main(String[] args) {

		Animal dog = new Dog();
		Animal bird = new Bird();
		
		System.out.println("Dog: " + dog.tryToFly()); 
		System.out.println("Bird: " + bird.tryToFly()); 
		
		//Giving flying behavior to Dog
		dog.setFlyingAbility(new ItFlys());
		
		System.out.println("Dog: " + dog.tryToFly()); 
		System.out.println("Bird: " + bird.tryToFly()); 
	}

}
