package com.meennujaiswal.designpatterns.creational.factory;

public class Cart {
	
	public static void main(String[] args) {
		Discount discount = DiscountFactory.getDiscount("cardDiscount");
		System.out.println(discount.calculateDiscount(10000));
	}
}
