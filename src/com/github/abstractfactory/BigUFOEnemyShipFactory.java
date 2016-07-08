package com.github.abstractfactory;

public class BigUFOEnemyShipFactory implements EnemyShipFactory{

	@Override
	public ESWeapon addESGun() {
		return new ESBigUFOGun();
	}

	@Override
	public ESEngine addESEngine() {
		return new ESBigUFOEngine();
	}

}
