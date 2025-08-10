package com.wipro.collection.test;

public class testbox {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.add("Hello");
        System.out.println("String value: " + stringBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.add(100);
        System.out.println("Integer value: " + intBox.get());
    }
}
