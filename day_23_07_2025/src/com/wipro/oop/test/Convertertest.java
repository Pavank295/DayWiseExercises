package com.wipro.oop.test;
import com.wipro.oop.Converter;
public class Convertertest {
    public static void main(String[] args) {
        Converter c = new Converter();
        int result1 = c.convert(5);
        int result2 = c.convert(10, 20);
        double result3 = c.convert(8.0);
        System.out.println("Result1: " + result1); 
        System.out.println("Result2: " + result2);
        System.out.println("Result3: " + result3); 
    }
}