package com.meennujaiswal.designpatterns.creational.singleton;

public class DoubleCheckedSingleton {
	
	private static volatile DoubleCheckedSingleton INSTANCE = null;
	
	private DoubleCheckedSingleton() {
	}
	
	public static DoubleCheckedSingleton getInstance() {
		if(INSTANCE==null) {
			synchronized (DoubleCheckedSingleton.class) {
				if(INSTANCE==null) {
					INSTANCE = new DoubleCheckedSingleton();

				}
			}
		}
		return INSTANCE;
	}



}
