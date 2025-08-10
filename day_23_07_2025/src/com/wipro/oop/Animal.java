package com.wipro.oop;
public abstract class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(name + " is eating.");
    }
    public abstract void makeSound();
}
