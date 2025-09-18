package com.mounika.assignment.employee;

public class Manager {
    private String department;

    public Manager(String name, int employeeId, double salary, String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
