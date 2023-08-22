package com.meennujaiswal.designpatterns.structural.flyweight;

public class Client {
	
	public static void main(String[] args) {
		
		Shape circle1 = ShapeFactory.getCircle("Blue");
		circle1.draw();
		
		Shape circle2 = ShapeFactory.getCircle("Blue");
		circle2.draw();
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		String s3 = new String("Hello").intern();
		
		System.out.println(s1==s3);
		
	}

}
