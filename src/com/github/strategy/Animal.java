package com.github.strategy;

/**
 * TYPE : Behavioral
 * 
 * NOTES: Avoid Interfaces that just force action, Using Interfaces just to
 * force the method creation is bad idea
 * 
 * The strategy pattern uses composition instead of inheritance. In the strategy
 * pattern, behaviors are defined as separate interfaces and specific classes
 * that implement these interfaces. This allows better decoupling between the
 * behavior and the class that uses the behavior. The behavior can be changed
 * without breaking the classes that use it, and the classes can switch between
 * behaviors by changing the specific implementation used without requiring any
 * significant code changes. Behaviors can also be changed at run-time as well
 * as at design-time
 * 
 * This gives greater flexibility in design and is in harmony with the
 * Open/closed principle (OCP) that states that classes should be open for
 * extension but closed for modification.
 * 
 * Identify the aspects of your application that vary and separate them from
 * what stays the same. Take what varies and “encapsulate” it so it won’t affect
 * the rest of your code. 
 * Program to an interface not to an implementation.
 * Favor composition over inheritance.
 * 
 * Links:
 * https://en.wikipedia.org/wiki/Strategy_pattern
 * https://en.wikibooks.org/wiki/Computer_Science_Design_Patterns/Strategy
 * 
 */
public class Animal {

	private String name;
	private int weight;
	private double height;
	private String favFood;
	private String sound;
	private double speed;

	//Behavior can change without side effects
	//Behavior is not tied to superclass or subclass
	private Flys flyingType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		if(weight < 0) {
			System.out.println("Weight can not be negative");
		} else {
			this.weight = weight;
		}
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height < 0) {
			System.out.println("Height can not be negative");
		} else {
			this.height = height;
		}
	}
	
	public String getFavFood() {
		return favFood;
	}
	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}
	
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	//This is to give flying ability to fly to Animals like Bird and all
	//If we add this method in super class then it will affect all animals that can't fly like Dog
	//And if you override this in every sub class then it will create lots of duplicate code if we have more animals that are flying
	//So we are deleting this method
//	public void fly() {
//		System.out.println("I am flying");
//	}

	//Changing Behavior at runtime
	public void setFlyingAbility(Flys newFlyType) {
		flyingType = newFlyType;
	}
	
	//Flying Behavior
	public String tryToFly() {
		return flyingType.fly();
	}
}
