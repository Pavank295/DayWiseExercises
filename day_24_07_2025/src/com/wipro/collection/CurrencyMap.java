package com.wipro.collection;
import java.util.*;
public class CurrencyMap {
    public static void main(String[] args) {
        Map<String, String> currencyMap = new HashMap<>();
        currencyMap.put("INR", "Indian Rupee");
        currencyMap.put("USD", "United States Dollar");
        currencyMap.put("EUR", "Euro");
        currencyMap.put("JPY", "Japanese Yen");
        List<Map.Entry<String, String>> entryList = new ArrayList<>(currencyMap.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        for (Map.Entry<String, String> entry : entryList) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}