package com.wipro.anonymous;
import java.util.*;
public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Amit", 45000));
        employees.add(new Employee(1, "Jayanta", 55000));
        employees.add(new Employee(2, "Vasu", 40000));
        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
