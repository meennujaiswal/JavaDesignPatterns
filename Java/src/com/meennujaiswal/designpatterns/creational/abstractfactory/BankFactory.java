package com.meennujaiswal.designpatterns.creational.abstractfactory;

import com.meennujaiswal.designpatterns.creational.abstractfactory.bank.ABCBank;
import com.meennujaiswal.designpatterns.creational.abstractfactory.bank.Bank;
import com.meennujaiswal.designpatterns.creational.abstractfactory.bank.PQRBank;
import com.meennujaiswal.designpatterns.creational.abstractfactory.bank.XYZBank;
import com.meennujaiswal.designpatterns.creational.abstractfactory.insurance.Insurance;

public class BankFactory extends AbstractFactory{
	
	public Bank getBank(String bank) {
		switch (bank) {
			case "ABCBank" : return new ABCBank();
			case "XYZBank" : return new XYZBank();
			case "PQRBank" : return new PQRBank();
		}
		return null;
	}

	@Override
	public Insurance getInsurance(String insurance) {
		return null;
	}


}
