package com.wipro.anonymous;

public class MultiplyLamda {
    public static void main(String[] args) {
        Multiply mul = (a, b) -> a * b;
        int result = mul.multiply(5, 4);
        System.out.println("Multiplication Result: " + result);
    }
}
