package com.wipro.collection;

public class Employeesalary{
    String empId, empName;
    int empAge;
    double empSalary;
    Employeesalary(String empId, String empName, int empAge, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }
    public String toString() {
        return empId + " - " + empName + " - " + empSalary;
    }
}