package com.github.observer;

import java.util.ArrayList;

/**
 * TYPE : Behavioral
 * 
 */
public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	
	private double ibmPrice;
	private double googlePrice;
	
	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unregister(Observer observer) {
		int index = observers.indexOf(observer);
		System.out.println("Deleted Observer : " + index);
		observers.remove(index);
	}

	@Override
	public void notifyObserver() {

		for(Observer observer : observers) {
			observer.update(ibmPrice, googlePrice);
		}
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public void setGooglePrice(double googlePrice) {
		this.googlePrice = googlePrice;
		notifyObserver();
	}
	
	

}
