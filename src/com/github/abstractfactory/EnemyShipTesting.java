package com.github.abstractfactory;

public class EnemyShipTesting {

	public static void main(String[] args) {
		EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();
		
		EnemyShip theGrunt = MakeUFOs.orderTheShip("UFO");
		System.out.println(theGrunt + "\n");
		
		EnemyShip theBoss = MakeUFOs.orderTheShip("BigUFO");
		System.out.println(theBoss + "\n");
	}

}
