package com.github.factory;

import java.util.Scanner;

public class EnemyShipTestingWithFactoryPattern {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What type of ship UFO / BigUFO / Rocket");
		
		String inputEnemy = "";
		if(scanner.hasNextLine()) {
			inputEnemy = scanner.nextLine();
		}

		EnemyShip enemyShip = new EnemyShipFactory().makeEnemyShip(inputEnemy);
		if(enemyShip != null) {
			doEnemyStuff(enemyShip);
		}
	}

	private static void doEnemyStuff(EnemyShip enemyShip) {
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.enemyShipShoots();
	}

}
