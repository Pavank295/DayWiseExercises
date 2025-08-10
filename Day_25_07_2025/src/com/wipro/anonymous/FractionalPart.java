package com.wipro.anonymous;
import java.util.function.Function;
public class FractionalPart{
    public static void main(String[] args) {
        Function<Double, String> getFractionPart = num -> {
            double frac = num - Math.floor(num);
            return String.format("%.2f", frac).substring(1);
        };
        System.out.print(getFractionPart.apply(123.45));
    }
}