package com.wipro.collection.test;
import java.util.concurrent.CopyOnWriteArrayList;
public class Employeesalarytest {
    CopyOnWriteArrayList<Employeesalary> list = new CopyOnWriteArrayList<>();
    list.add(new Employee("E1", "Alice", 28, 90000));
    list.add(new Employee("E2", "Bob", 30, 75000));
    list.add(new Employee("E3", "John", 35, 85000));
    list.add(new Employee("E4", "David", 26, 60000));
    for (Employee e : list) {
        if (e.empSalary > 80000) {
            list.remove(e);
        }
    }
    System.out.println("Employees with salary <= 80000:");
    for (Employee e : list) {
        System.out.println(e);
    }
}
}
