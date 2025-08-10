package com.wipro.collection.test;
import java.util.HashSet;
import java.util.Set;
public class setdifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        Set<Integer> set2 = new HashSet<>();
        set2.add(30);
        set2.add(40);
        set2.add(50);
        set1.removeAll(set2);
        System.out.println("Difference (set1 - set2): " + set1);
    }
}
