package com.Wipro.mysql;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class SortStringsUsingStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zara", "Alex", "John", "Bob", "Mike");
        List<String> sortedNames = names.stream().sorted(String::compareTo).collect(Collectors.toList());
        sortedNames.forEach(System.out::println);
    }
}

