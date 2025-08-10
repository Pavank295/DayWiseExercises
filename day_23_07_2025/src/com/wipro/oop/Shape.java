package com.wipro.oop;

public class Shape {
    private String color;
    private String name;
    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public String getColor(){ 
    	return color; 
    	}
    public void setColor(String color) {
    	this.color = color; 
    	}
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String toString() {
        return "Shape [Name=" + name + ", Color=" + color + "]";
    }
}