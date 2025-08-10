package com.wipro.anonymous;

public class LamdaExample {
    public static void main(String[] args) {
        Greet greet = () -> System.out.println("Hello Lambda");
        greet.sayHello();
    }
}
