package com.meennujaiswal.designpatterns.creational.abstractfactory;

import com.meennujaiswal.designpatterns.creational.abstractfactory.bank.Bank;
import com.meennujaiswal.designpatterns.creational.abstractfactory.insurance.HealthInsurance;
import com.meennujaiswal.designpatterns.creational.abstractfactory.insurance.Insurance;
import com.meennujaiswal.designpatterns.creational.abstractfactory.insurance.TermInsurance;
import com.meennujaiswal.designpatterns.creational.abstractfactory.insurance.VehicleInsurance;

public class InsuranceFactory extends AbstractFactory{

	public Insurance getInsurance(String insurance) {
		switch (insurance) {
		case "HealthInsurance" : return new HealthInsurance();
		case "TermInsurance" : return new TermInsurance();
		case "VehicleInsurance" : return new VehicleInsurance();
		}
		return null;
	}

	@Override
	public Bank getBank(String bank) {
		return null;
	}

}
