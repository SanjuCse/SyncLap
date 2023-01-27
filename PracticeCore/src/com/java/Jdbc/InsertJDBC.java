package com.java.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertJDBC {
	public static void main(String[] args) {
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// creating a connection
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String username = "root";
			String password = "root";
			Connection connection = DriverManager.getConnection(url, username, password);

			// create a query
			String query = "create table demotable(tId int(20) primary key auto_increment, tName varchar(50) not null, tCity varchar(100))";
			Statement statement = connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("table created successfully!");

			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
