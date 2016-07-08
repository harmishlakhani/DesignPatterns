package com.github.abstractfactory;

public abstract class EnemyShip {

	private String name;
	ESWeapon weapon;
	ESEngine engine;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	abstract void makeShip();
	
	public void followHeroShip() {
		System.out.println(getName() + " is following the hero");
	}
	
	public void displayEnemyShip() {
		System.out.println(getName() + " is on screen");
	}
	
	public void enemyShipShoots() {
		System.out.println(getName() + " attacks and does " + weapon);
	}
	
	public String toString() {
	
		return "The " + name + " has a top speed of " + engine + " and an attack powe of " + weapon;
	}
}
