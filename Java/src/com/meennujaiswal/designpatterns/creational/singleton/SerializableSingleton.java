package com.meennujaiswal.designpatterns.creational.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private static SerializableSingleton INSTANCE;
	
	private SerializableSingleton() {
	}
	
	public static SerializableSingleton getInstance() {
		if(INSTANCE==null) {
			INSTANCE = new SerializableSingleton();
		}
		return INSTANCE;
	}
	
	protected Object readResolve() {
		return getInstance();
	}

}
