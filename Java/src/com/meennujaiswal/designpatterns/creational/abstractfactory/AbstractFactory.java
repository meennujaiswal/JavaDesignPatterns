package com.meennujaiswal.designpatterns.creational.abstractfactory;

import com.meennujaiswal.designpatterns.creational.abstractfactory.bank.Bank;
import com.meennujaiswal.designpatterns.creational.abstractfactory.insurance.Insurance;

public abstract class AbstractFactory {
	
	public abstract Bank getBank(String bank);
	public abstract Insurance getInsurance(String insurance);

}
