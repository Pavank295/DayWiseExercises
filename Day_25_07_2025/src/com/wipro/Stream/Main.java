package com.wipro.Stream;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<FoodItem> menu = Arrays.asList(
            new FoodItem("Veg Noodles", "Veg", "Chinese", 150),
            new FoodItem("Chicken Manchurian", "Non Veg", "Chinese", 200),
            new FoodItem("Pad Thai", "Veg", "Thai", 180),
            new FoodItem("Pizza", "Veg", "Continental", 250),
            new FoodItem("Spring Rolls", "Veg", "Chinese", 120),
            new FoodItem("Tom Yum Soup", "Non Veg", "Thai", 160)
        );
        List<FoodItem> chineseFoods = menu.stream().filter(item -> item.getCuisine().equalsIgnoreCase("Chinese")).collect(Collectors.toList());
        System.out.println("List of Chinese Food Items:");
        chineseFoods.forEach(System.out::println);
    }
}

