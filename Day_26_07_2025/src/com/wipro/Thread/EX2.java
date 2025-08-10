package com.wipro.Thread;
import java.util.*;
public class EX2{
    public static void main(String[] args) throws InterruptedException {
        List<String> names = new ArrayList<>(Arrays.asList("Amit", "Jayanta", "Esha", "Raj", "Uma", "Kunal"));
        Runnable vowelTask = () -> {
            for (int i = 0; i < names.size(); i++) {
                String name = names.get(i);
                char firstChar = Character.toUpperCase(name.charAt(0));
                if ("AEIOU".indexOf(firstChar) != -1) {
                    names.set(i, name.toUpperCase());
                }
            }
        };
        Runnable nonVowelTask = () -> {
            for (int i = 0; i < names.size(); i++) {
                String name = names.get(i);
                char firstChar = Character.toUpperCase(name.charAt(0));
                if ("AEIOU".indexOf(firstChar) == -1) {
                    names.set(i, name.toLowerCase());
                }
            }
        };
        Thread t1 = new Thread(vowelTask);
        Thread t2 = new Thread(nonVowelTask);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final List: " + names);
    }
}

