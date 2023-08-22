package com.meennujaiswal.designpatterns.creational.prototype;

public class PaintApp {
    public static void main(String[] args) {
    	Rectangle rectanglePrototype = new Rectangle("Red", 10, "dotted");
    	
    	Shape rectangle1 = rectanglePrototype.clone();
    	rectangle1.setColor("Blue");
    	rectangle1.draw();
    	
    	Shape rectangle2 = rectanglePrototype.clone();
    	rectangle2.setSize(5);
    	rectangle2.draw();
    }
}
