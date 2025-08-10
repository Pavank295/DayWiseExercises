package com.wipro.demo;
public class College {
    private String collegeName;
    private Department department;

    // Constructor for DI
    public College(String collegeName, Department department) {
        this.collegeName = collegeName;
        this.department = department;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "College [collegeName=" + collegeName + ", department=" + department + "]";
    }
}

