package com.mounika.assignment;

import com.mounika.assignment.employee.Developer;
import com.mounika.assignment.employee.Manager;
import com.mounika.assignment.utilities.Employeeutilities;

public class Assignment {

    public static void main(String[] args) {
        // Create instances of Manager and Developer
        Manager manager1 = new Manager("Alice Johnson", 101, 80000.0, "Engineering");
        Developer developer1 = new Developer("Bob Smith", 201, 75000.0, "Java");

        // Create an instance of EmployeeUtilities
        Employeeutilities employeeUtilities = new Employeeutilities();

        System.out.println("--- Initial Employee Details ---");
        employeeUtilities.displayEmployeeDetails(manager1);
        System.out.println("Department: " + manager1.getDepartment());

        System.out.println(); // Newline for separation

        employeeUtilities.displayEmployeeDetails(developer1);
        System.out.println("Programming Language: " + developer1.getProgrammingLanguage());

        // Use EmployeeUtilities methods to perform operations
        System.out.println("\n--- Applying Bonuses ---");
        employeeUtilities.giveBonus(manager1, 10.0);
        System.out.println(); // Newline for separation
        employeeUtilities.giveBonus(developer1, 5.0);

        System.out.println("\n--- Updated Employee Details ---");
        employeeUtilities.displayEmployeeDetails(manager1);
        System.out.println("Department: " + manager1.getDepartment());

        System.out.println(); // Newline for separation

        employeeUtilities.displayEmployeeDetails(developer1);
        System.out.println("Programming Language: " + developer1.getProgrammingLanguage());
    }
}
