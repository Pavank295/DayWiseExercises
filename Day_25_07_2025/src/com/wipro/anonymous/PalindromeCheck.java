package com.wipro.anonymous;
import java.util.function.Predicate;
public class PalindromeCheck {
    public static void main(String[] args) {
        Predicate<String> isPalindrome = str -> {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equalsIgnoreCase(reversed);
        };
        String word1 = "madam";
        System.out.println(word1 + " is palindrome? " + isPalindrome.test(word1));
    }
}
