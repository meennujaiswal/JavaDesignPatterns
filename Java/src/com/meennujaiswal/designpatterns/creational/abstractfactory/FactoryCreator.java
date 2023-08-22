package com.meennujaiswal.designpatterns.creational.abstractfactory;

public class FactoryCreator {
	
	public AbstractFactory getFactory(String factory) {
		if(factory.equals("Bank")) {
			return new BankFactory();
		}else if(factory.equals("Insurance")) {
			return new InsuranceFactory();
		}
		
		return null;
	}

}
