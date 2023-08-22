package com.meennujaiswal.designpatterns.structural.adapter;

public class Client {
	
	public static void main(String[] args) {
		OrderPlacer orderPlacer = new OrderPlacer();
		GroceryOrder groceryOrder = new GroceryOrder();
		DiscountedOrder discountedOrder = new DiscountedOrder();
		Client client = new Client();
		client.placeOrder(orderPlacer, discountedOrder);
	}
	
	public boolean placeOrder(OrderPlacer orderPlacer, Order order) {
		return orderPlacer.placeOrder(order);
	}

}
