package com.meennujaiswal.designpatterns.creational.prototype;

public class Client {
	
	public static void main(String[] args) {
		TestClone main = new TestClone();
		TestClone clone = main.clone();
		System.out.println(clone.getInstanceVariable());
		
	}

}
