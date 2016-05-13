package com.github.observer;

public class GetTheStocks implements Runnable {

	private int startTime;
	private String stock;
	private double price;
	
	private Subject stockGrabber; 
	
	public GetTheStocks(Subject stockGrabber, int startTime, String stock, double price) {
		this.stockGrabber = stockGrabber;
		this.startTime = startTime;
		this.stock = stock;
		this.price = price;
	}
	
	@Override
	public void run() {

		for(int i = 1; i <= 20; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			double ranNum = (Math.random() * .06 ) - .03;
			price = price + ranNum;
			
			if(stock.equals("IBM")) ((StockGrabber) stockGrabber).setIbmPrice(price);
			if(stock.equals("Google")) ((StockGrabber) stockGrabber).setGooglePrice(price);
			
			System.out.println("Stock price : " + price);
		}
	}

}
