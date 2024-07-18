package com.JDBCProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*Programmimg language data maintain 
java (JDBC API)application 
programming interface database        
collection of interfaces and classes
*/

public class MyFirstJDBCDemo {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		/*step 1. Register the driver
		com.mysql.jdbc.Driver 
		com.mysql.cj.jdbc.Driver.
		
		// Im using Mysql database i need to install my sql database in my system
		
		//when i will register the driver i need mysql driver
	
		//requierd the URL of Mysql which i install in my system
		
		jdbc:mysql://localhost:3306/mydb
		
   (java)API:Database//localhost:port no/database name	
   					//localmachine port no is always 3306
		//requied username and password of mysql*/
			
		Class.forName("com.mysql.cj.jdbc.Driver");//step 1. Register the driver
		
		//step 2 establish connection to mysql
		//JDBC api which are the interfaces and classes ara availbale to establish a connection
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch7293","root","root");
		
		//creating the statement
		
		Statement stmt=con.createStatement();
		
		stmt.executeUpdate("insert into emp values(1, 'Padmaja', 'Trianer', 'IT', 10000)");
		System.out.println("EMployee add hua");
		con.close();
	}


}
