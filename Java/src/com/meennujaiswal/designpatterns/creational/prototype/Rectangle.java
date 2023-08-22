package com.meennujaiswal.designpatterns.creational.prototype;

public class Rectangle implements Shape {
    private String color;
    private int size;
    private String style;
    
    public Rectangle(String color, int size, String style) {
        this.color = color;
        this.size = size;
        this.style = style;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public void setStyle(String style) {
        this.style = style;
    }
    
    public void draw() {
        System.out.println("Drawing a rectangle with color " + color + ", size " + size + ", and style " + style);
    }
    
    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
