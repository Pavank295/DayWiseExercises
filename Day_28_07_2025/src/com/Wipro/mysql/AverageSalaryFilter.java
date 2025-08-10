package com.Wipro.mysql;
import java.util.*;
import java.util.stream.*;
public class AverageSalaryFilter {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John", 25, 40000),
            new Employee("Alice", 35, 60000),
            new Employee("Bob", 40, 70000),
            new Employee("Charlie", 20, 30000),
            new Employee("David", 38, 55000)
        );
        OptionalDouble avgSalary = employees.stream()
                .filter(e -> e.age > 30 && e.salary > 50000)
                .mapToDouble(e -> e.salary)
                .average();

            if (avgSalary.isPresent()) {
                System.out.println("Average Salary: " + avgSalary.getAsDouble());
            } else {
                System.out.println("No employees match the criteria.");
            }
        }
    }
