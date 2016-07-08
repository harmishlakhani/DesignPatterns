package com.github.abstractfactory;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {

	protected EnemyShip makeEnemyShip(String typeOfShip) {
        
		EnemyShip theEnemyShip = null;
        
		if(typeOfShip.equals("UFO")){
            EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Ship");
        } else if(typeOfShip.equals("BigUFO")){
            EnemyShipFactory shipPartsFactory = new BigUFOEnemyShipFactory();
            theEnemyShip = new BigUFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("Big UFO Ship");
        }
        return theEnemyShip;
    }
}