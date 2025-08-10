package com.wipro.Stream;
import java.util.*;
import java.util.stream.Collectors;
public class Ex12 {
	public static void main(String[] args) {
    List<String> names = Arrays.asList("Jayanta","raja", "Jnanedra");
    List<String> filteredNames = names.stream().filter(name -> name.toLowerCase().contains("ja")).collect(Collectors.toList());
    System.out.println("Names with 'j' and 'a' consecutively: " + filteredNames);
}
}
