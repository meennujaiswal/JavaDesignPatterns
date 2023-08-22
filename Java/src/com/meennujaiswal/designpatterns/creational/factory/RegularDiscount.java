package com.meennujaiswal.designpatterns.creational.factory;

public class RegularDiscount implements Discount{
	
	private static double discountPercent = 5;

	@Override
	public double calculateDiscount(double price) {
		return (price*discountPercent)/100;
	}

	@Override
	public double getDiscount() {
		return discountPercent;
	}

}
