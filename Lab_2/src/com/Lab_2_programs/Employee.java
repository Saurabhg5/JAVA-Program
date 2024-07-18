package com.Lab_2_programs;

public class Employee {
    // Attributes
    private String name;
    private String jobTitle;
    private double salary;

    // Constructor
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    // Method to update salary
    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    // Method to calculate yearly salary increase (5% increase)
    public void yearlySalaryIncrease() {
        double increaseAmount = salary * 0.05;
        salary += increaseAmount;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating an employee object
        Employee emp1 = new Employee("John Doe", "Software Engineer", 60000);

        // Displaying employee information
        emp1.displayInfo();

        // Updating employee salary
        emp1.updateSalary(65000);

        // Displaying updated employee information
        emp1.displayInfo();

        // Applying yearly salary increase
        emp1.yearlySalaryIncrease();

        // Displaying employee information after yearly increase
        emp1.displayInfo();
    }
}