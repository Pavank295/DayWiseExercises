package com.wipro.oop;

public class Square extends Shape {
    private double side;

    public Square(String color, double side) {
        super("Square", color);
        this.side = side;
    }

    public double getSide() { return side; }
    public void setSide(double side) { this.side = side; }

    public String toString() {
        return super.toString() + ", Side=" + side;
    }
}

