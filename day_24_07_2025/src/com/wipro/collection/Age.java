package com.wipro.collection;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Age {
    LocalDate today = LocalDate.now();
    return Period.between(dt, today).getYears();
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter birth year: ");
    int year = scanner.nextInt();
    System.out.print("Enter birth month: ");
    int month = scanner.nextInt();
    System.out.print("Enter birth day: ");
    int day = scanner.nextInt();
    LocalDate birthDate = LocalDate.of(year, month, day);
    int age = getAge(birthDate);
    System.out.println("Your age is: " + age + " years");
    scanner.close();
}
}
}
