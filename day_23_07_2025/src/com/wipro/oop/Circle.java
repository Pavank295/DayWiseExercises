package com.wipro.oop;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super("Circle", color);
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public String toString() {
        return super.toString() + ", Radius=" + radius;
    }
}
