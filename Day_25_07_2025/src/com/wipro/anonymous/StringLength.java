package com.wipro.anonymous;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class StringLength {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Jayanta", "Amit", "Vasu");
        Function<String, Integer> getLength = str -> str.length();
        List<Integer> lengths = input.stream().map(getLength).collect(Collectors.toList());
        System.out.println(lengths); 
    }
}