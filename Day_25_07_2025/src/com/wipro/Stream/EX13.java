package com.wipro.Stream;
import java.util.*;
import java.util.stream.Collectors;
public class EX13 {
	public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        double average = numbers.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println("Average: " + average);
    }
}
