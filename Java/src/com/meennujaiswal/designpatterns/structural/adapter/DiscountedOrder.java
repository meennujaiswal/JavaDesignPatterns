package com.meennujaiswal.designpatterns.structural.adapter;

public class DiscountedOrder implements Order{
	
	Discount discount = new Discount();
	
	private long applyDiscount(long amount) {
		return amount - discount.getTotalDiscount();
	}

	@Override
	public long getTotalAmount() {
		return applyDiscount(20000);
	}
}
