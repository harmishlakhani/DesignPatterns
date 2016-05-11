package com.github.strategy;

public class Dog extends Animal {

	public Dog() {
		super();
		setSound("Bark");
		setFlyingAbility(new CantFly());
	}
	
	public void digHole() {
		System.out.println("Dug a Hole");
	}
}
