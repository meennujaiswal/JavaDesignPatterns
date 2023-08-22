package com.meennujaiswal.designpatterns.structural.adapter;

public class ElectronicsOrder implements Order {

	@Override
	public long getTotalAmount() {
		System.out.println("Calculating total grocery amount");
		return 200000;
	}

}
