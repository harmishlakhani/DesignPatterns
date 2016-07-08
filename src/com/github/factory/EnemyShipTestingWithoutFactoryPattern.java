package com.github.factory;

import java.util.Scanner;

public class EnemyShipTestingWithoutFactoryPattern {

	public static void main(String[] args) {
		
		EnemyShip enemyShip = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What type of ship UFO / Rocket");
		
		String inputEnemy = "";
		if(scanner.hasNextLine()) {
			inputEnemy = scanner.nextLine();
		}
		
		if(inputEnemy.equals("UFO")) {
			enemyShip = new UFOEnemyShip();
		} else if(inputEnemy.equals("Rocket")) {
			enemyShip = new RocketEnemyShip();
		} else {
			System.out.println("Invalid Input");
			return;
		}
		doEnemyStuff(enemyShip);
	}

	private static void doEnemyStuff(EnemyShip enemyShip) {
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.enemyShipShoots();
	}

}
