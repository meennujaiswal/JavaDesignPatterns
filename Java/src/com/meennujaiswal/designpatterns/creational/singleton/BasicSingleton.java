package com.meennujaiswal.designpatterns.creational.singleton;

public class BasicSingleton {
	
	private static BasicSingleton INSTANCE;
	
	private BasicSingleton() {
	}
	
	public static BasicSingleton getInstance() {
		if(INSTANCE==null) {
			INSTANCE = new BasicSingleton();
		}
		return INSTANCE;
	}

}
