package com.meennujaiswal.designpatterns.structural.adapter;

public class OrderPlacer {
	
	public boolean placeOrder(Order order) {
		System.out.println("Handling the order placing logic");
		long totalAmount = order.getTotalAmount();
		System.out.println(totalAmount);
		return true;
	}

}
