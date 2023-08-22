package com.meennujaiswal.designpatterns.creational.abstractfactory;

import com.meennujaiswal.designpatterns.creational.abstractfactory.bank.Bank;
import com.meennujaiswal.designpatterns.creational.abstractfactory.insurance.Insurance;

public class Client {
	
	public static void main(String[] args) {
		FactoryCreator creator = new FactoryCreator();
		
		Bank bank = createBank(creator, "ABCBank");
		
		Insurance insurance = createInsurance(creator, "TermInsurance");
		
		System.out.println(bank.getDetails());
		
		System.out.println(insurance.getDetails());
	}

	private static Insurance createInsurance(FactoryCreator creator, String insurance) {
		AbstractFactory insuranceFactory = creator.getFactory("Insurance");
		return insuranceFactory.getInsurance(insurance);
	}

	private static Bank createBank(FactoryCreator creator, String bank) {
		AbstractFactory bankFactory = creator.getFactory("Bank");
		return bankFactory.getBank(bank);
	}

}
