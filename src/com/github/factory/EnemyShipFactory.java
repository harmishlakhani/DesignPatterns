package com.github.factory;

public class EnemyShipFactory {

	public EnemyShip makeEnemyShip(String shipType) {
		
		EnemyShip enemyShip = null;
		
		if (shipType.equals("UFO")) {
			enemyShip = new UFOEnemyShip();
		} else if (shipType.equals("Rocket")) {
			enemyShip = new RocketEnemyShip();
		} else if (shipType.equals("BigUFO")) {
			enemyShip = new BigUFOEnemyShip();
		} else {
			System.out.println("Invalid Input");
		}
		return enemyShip;
	}
}
