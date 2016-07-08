package com.github.abstractfactory;

public class BigUFOEnemyShip extends EnemyShip {

	EnemyShipFactory enemyShipFactory;
	
	public  BigUFOEnemyShip(EnemyShipFactory enemyShipFactory) {
		this.enemyShipFactory = enemyShipFactory;
	}

	@Override
	void makeShip() {

		System.out.println("Making Enemy Ship " + getName());
		weapon = enemyShipFactory.addESGun();
		engine = enemyShipFactory.addESEngine();
	}
}
