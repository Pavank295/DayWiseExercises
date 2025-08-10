package com.wipro.collection;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Ex12 {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first date:");
    System.out.print("Year: ");
    int year1 = scanner.nextInt();
    System.out.print("Month: ");
    int month1 = scanner.nextInt();
    System.out.print("Day: ");
    int day1 = scanner.nextInt();
    System.out.println("Enter second date:");
    System.out.print("Year: ");
    int year2 = scanner.nextInt();
    System.out.print("Month: ");
    int month2 = scanner.nextInt();
    System.out.print("Day: ");
    int day2 = scanner.nextInt();
    LocalDate date1 = LocalDate.of(year1, month1, day1);
    LocalDate date2 = LocalDate.of(year2, month2, day2);
    if (date1.isAfter(date2)) {
        LocalDate temp = date1;
        date1 = date2;
        date2 = temp;
    }
    Period diff = Period.between(date1, date2);
    System.out.println("Difference is: " + diff.getYears() + " years, " +
                       diff.getMonths() + " months, " +
                       diff.getDays() + " days");

    scanner.close();
}
}
