package com.company;

public class Main {
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement(5);

        management.addEmployee(new Employee("E001", "Alice", "Manager", 70000));
        management.addEmployee(new Employee("E002", "Bob", "Developer", 50000));
        management.addEmployee(new Employee("E003", "Charlie", "Designer", 45000));
        management.addEmployee(new Employee("E004", "Diana", "Analyst", 48000));
        management.addEmployee(new Employee("E005", "Eve", "HR", 40000));

        System.out.println("All Employees:");
        management.traverseEmployees();

        System.out.println("\nSearching for Employee E003:");
        Employee foundEmployee = management.searchEmployee("E003");
        if (foundEmployee != null) {
            System.out.println("Found: " + foundEmployee);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting Employee E002:");
        management.deleteEmployee("E002");

        System.out.println("\nAll Employees after deletion:");
        management.traverseEmployees();
    }
}
