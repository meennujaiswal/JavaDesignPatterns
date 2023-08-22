package com.meennujaiswal.designpatterns.creational.prototype;

public interface Shape extends Cloneable {
    public Shape clone();
    public void setColor(String color);
    public void setSize(int size);
    public void setStyle(String style);
    public void draw();
}
