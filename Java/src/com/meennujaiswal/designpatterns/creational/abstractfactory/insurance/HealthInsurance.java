package com.meennujaiswal.designpatterns.creational.abstractfactory.insurance;

public class HealthInsurance implements Insurance {

	@Override
	public String getDetails() {
		return "These are health insurance details";
	}

}
