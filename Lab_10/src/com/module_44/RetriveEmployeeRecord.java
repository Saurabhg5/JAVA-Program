package com.module_44;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetriveEmployeeRecord {

    public static void main(String[] args) {
        // Replace these with your connection details
        String url = "jdbc:mysql://localhost:3306/module_44";
        String username = "root";
        String password = "root";

        // SQL query to retrieve data from the Employee table
        String selectSQL = "SELECT id, name, email, department FROM Employee";

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection to the database
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/module_44", "root", "root")) {
                // Create a PreparedStatement for the SELECT query
                try (PreparedStatement pstmt = connection.prepareStatement(selectSQL)) {
                    // Execute the query and obtain the ResultSet
                    try (ResultSet rs = pstmt.executeQuery()) {
                        // Process the ResultSet
                        while (rs.next()) {
                            int id = rs.getInt("id");
                            String name = rs.getString("name");
                            String email = rs.getString("email");
                            String department = rs.getString("department");

                            // Print retrieved data or process as needed
                            System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email + ", Department: " + department);
                        }
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
