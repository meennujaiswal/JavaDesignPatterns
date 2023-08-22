package com.meennujaiswal.designpatterns.creational.factory;

public abstract class DiscountFactory {
	
	public static Discount getDiscount(String discount) {
		switch(discount) {
			case "cardDiscount": return new CardDiscount();
			case "walletDiscount": return new WalletDiscount();
			case "regularDiscount": return new RegularDiscount();
			default: return new RegularDiscount();
		}
	}

}
