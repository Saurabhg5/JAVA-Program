package com.module_44;

import java.sql.*;

public class CreateTable {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Replace these with your connection details
        String url = "jdbc:mysql://localhost:3306/module_44";
        String username = "root";
        String password = "root";

        // Load the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connect to the database
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/module_44", "root", "root");

        // Create a statement object
        Statement statement = connection.createStatement();

        // Define the SQL statement to create the table
        String sql = "CREATE TABLE Employee (" +
                "id INT PRIMARY KEY AUTO_INCREMENT, " +
                "name VARCHAR(255) NOT NULL, " +
                "email VARCHAR(255) NOT NULL UNIQUE, " +
                "department VARCHAR(100) NOT NULL " +
                ")";

        // Execute the statement
        statement.execute(sql);

        System.out.println("Employee table created successfully!");

        // Close resources (recommended using try-with-resources)
        statement.close();
        connection.close();
    }
}