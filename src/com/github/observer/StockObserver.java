package com.github.observer;

public class StockObserver implements Observer {
	
	private double ibmPrice;
	private double googlePrice;
	
	private static int observerIDTracker = 0;
	private int observerID;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		observerID = ++observerIDTracker;
		System.out.println("New Observer : " + this.observerID);
		stockGrabber.register(this);
	}
	
	@Override
	public void update(double ibmPrice, double googlePrice) {
		this.ibmPrice = ibmPrice;
		this.googlePrice = googlePrice;
		printStocks();
	}

	public void printStocks() {
		System.out.println(observerID + "\n IBM : " + ibmPrice + "\n Google : " + googlePrice);
	}
}
