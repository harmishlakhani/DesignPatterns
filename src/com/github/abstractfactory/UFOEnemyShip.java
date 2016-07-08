package com.github.abstractfactory;

public class UFOEnemyShip extends EnemyShip {

	EnemyShipFactory enemyShipFactory;
	
	public  UFOEnemyShip(EnemyShipFactory enemyShipFactory) {
		this.enemyShipFactory = enemyShipFactory;
	}

	@Override
	void makeShip() {

		System.out.println("Making Enemy Ship " + getName());
		weapon = enemyShipFactory.addESGun();
		engine = enemyShipFactory.addESEngine();
	}
}
