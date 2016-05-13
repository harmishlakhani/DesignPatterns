package com.github.observer;

public class GrabStocks {

	public static void main(String[] args) {

		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setGooglePrice(100);
		stockGrabber.setIbmPrice(200);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setGooglePrice(300);
		stockGrabber.setIbmPrice(400);
		
		stockGrabber.unregister(observer2);
		
		stockGrabber.setGooglePrice(1000);
		stockGrabber.setIbmPrice(2000);
		
		Runnable ibm = new GetTheStocks(stockGrabber, 1, "IBM", 10);
		Runnable google = new GetTheStocks(stockGrabber, 1, "Google", 20);
		
		new Thread(ibm).start();
		new Thread(google).start();
	}

}
