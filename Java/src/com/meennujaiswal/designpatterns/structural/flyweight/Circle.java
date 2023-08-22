package com.meennujaiswal.designpatterns.structural.flyweight;

public class Circle implements Shape {
	
	private String color;
	
	public Circle(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("Drawing circle with color " + color);		
	}

}
