package com.meennujaiswal.designpatterns.structural.flyweight;

import java.util.Map;
import java.util.HashMap;

public class ShapeFactory {
	
	public static final Map<String, Shape> CIRCLE_STORE = new HashMap<>();
	
	public static Circle getCircle(String color) {
		
		Circle circle = (Circle) CIRCLE_STORE.get(color);
		
		if (circle == null) {
			circle = new Circle(color);
			CIRCLE_STORE.put(color, circle);
			System.out.println("Creating a Circle of color: "+ color);
		}
		
		return circle;
		
	}
}