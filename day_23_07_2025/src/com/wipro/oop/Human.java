package com.wipro.oop;
public class Human extends Animal {
    public Human(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println(name + " says: Hello!");
    }
}