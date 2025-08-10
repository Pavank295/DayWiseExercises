package com.wipro.Stream;
import java.util.Optional;
public class Ex16 {
    public static void main(String[] args) {
        Optional<Integer> optionalNumber = Optional.of(100);
        optionalNumber.ifPresent(value -> System.out.println("Value is present: " + value));
        Optional<Integer> emptyOptional = Optional.empty();
        int defaultValue = emptyOptional.orElse(999);
        System.out.println("Value from empty optional (with default): " + defaultValue);
    }
}
