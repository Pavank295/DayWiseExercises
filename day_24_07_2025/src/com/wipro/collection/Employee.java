package com.wipro.collection;
import java.util.*;

public class Employee {
    String empId, empName;
    int empAge;
    double empSalary;

    Employee(String empId, String empName, int empAge, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    public String toString() {
        return empId + " - " + empName + " - " + empSalary;
    }
}

