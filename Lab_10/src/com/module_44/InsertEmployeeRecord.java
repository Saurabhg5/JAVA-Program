package com.module_44;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertEmployeeRecord {

    public static void main(String[] args) {
        // Replace these with your connection details
        String url = "jdbc:mysql://localhost:3306/module_44";
        String username = "root";
        String password = "root";

        // SQL statement to insert a record into the table
        String insertSQL = "INSERT INTO Employee (name, email, department) VALUES (?, ?, ?)";

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection to the database
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/module_44",  "root",  "root")) {
                // Create a PreparedStatement for insertion
                try (PreparedStatement pstmt = connection.prepareStatement(insertSQL)) {
                    // Set values for parameters in the prepared statement
                    pstmt.setString(1, "Nivedita Sonkawade");
                    pstmt.setString(2, "nivedita@gmail.com");
                    pstmt.setString(3, "IT");

                    // Execute the insertion
                    int rowsInserted = pstmt.executeUpdate();

                    if (rowsInserted > 0) {
                        System.out.println("A new record was inserted into the Employee table.");
                    } else {
                        System.out.println("Failed to insert a new record into the Employee table.");
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
