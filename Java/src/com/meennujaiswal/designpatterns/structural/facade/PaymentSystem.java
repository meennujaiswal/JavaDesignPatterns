package com.meennujaiswal.designpatterns.structural.facade;

public class PaymentSystem {

	public boolean processPayment(String cardNumber) {
		System.out.println("Processing payment");
		return true;
	}

}
