package com.wipro.collection;
class SortById implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.empId.compareTo(e2.empId);
    }
}

// Comparator to sort by empName
class SortByName implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.empName.compareTo(e2.empName);
    }
}

// Comparator to sort by empAge
class SortByAge implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.empAge, e2.empAge);
    }
}
public class Employeesort{
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("E3", "John", 30, 50000));
        list.add(new Employee("E1", "Alice", 25, 75000));
        list.add(new Employee("E2", "Bob", 28, 60000));

        System.out.println("Sorted by ID:");
        Collections.sort(list, new SortById());
        list.forEach(System.out::println);

        System.out.println("\nSorted by Name:");
        Collections.sort(list, new SortByName());
        list.forEach(System.out::println);

        System.out.println("\nSorted by Age:");
        Collections.sort(list, new SortByAge());
        list.forEach(System.out::println);
    }
}