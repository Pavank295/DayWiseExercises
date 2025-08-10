package com.wipro.anonymous;
import java.util.function.Predicate;
public class CaseCheck{
    public static void main(String[] args) {
        Predicate<String> isUpperCase = str -> str.equals(str.toUpperCase());
        Predicate<String> isLowerCase = str -> str.equals(str.toLowerCase());
        String word1 = "PAVAN";
        String word2 = "pavan";
        String word3 = "PaVan";
        System.out.println(word1 + " is uppercase? " + isUpperCase.test(word1));
        System.out.println(word2 + " is lowercase? " + isLowerCase.test(word2));
        System.out.println(word3 + " is uppercase? " + isUpperCase.test(word3));
        System.out.println(word3 + " is lowercase? " + isLowerCase.test(word3));
    }
}
