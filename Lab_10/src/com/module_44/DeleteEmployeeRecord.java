package com.module_44;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteEmployeeRecord {

    public static void main(String[] args) {
        // Replace these with your connection details
        String url = "jdbc:mysql://localhost:3306/module_44";
        String username = "root";
        String password = "root";

        // SQL statement to delete a record from the Employee table
        String deleteSQL = "DELETE FROM Employee WHERE id = ?";

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection to the database
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/module_44", "root", "root")) {
                // Create a PreparedStatement for deletion
                try (PreparedStatement pstmt = connection.prepareStatement(deleteSQL)) {
                    // Set the id of the record to delete
                    pstmt.setInt(1, 1); // Assuming you want to delete the record with id = 1

                    // Execute the deletion
                    int rowsDeleted = pstmt.executeUpdate();

                    if (rowsDeleted > 0) {
                        System.out.println("Record deleted successfully.");
                    } else {
                        System.out.println("No records deleted.");
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
