package com.meennujaiswal.designpatterns.creational.abstractfactory.insurance;

public class VehicleInsurance implements Insurance {

	@Override
	public String getDetails() {
		return "These are Vehicle Insurance Details";
	}

}
