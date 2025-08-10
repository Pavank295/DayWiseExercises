package com.wipro.anonymous;
import java.util.function.Consumer;
public class EvenNumber  {
    public static void main(String[] args) {
        Consumer<Integer> printNextEven = num -> {
            int nextEven = (num % 2 == 0) ? num + 2 : num + 1;
            System.out.println("Next even number is: " + nextEven);
        };
        printNextEven.accept(5);  
        printNextEven.accept(100);  
    }
}
