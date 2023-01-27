package com.java.Jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.jdbc.PreparedStatementWrapper;

public class InsertQuery {

	public static void main(String[] args) {
		try {
			// Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Create a Connection
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String userName = "root";
			String password = "root";
			Connection connection = DriverManager.getConnection(url, userName, password);

			// fire the query
			String query = "insert into demotable(tName,tCity) values(?,?)";

			// get the prepared statement object
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			//get the values from console
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name :");
			String name  = bufferedReader.readLine();
			
			System.out.println("Enter City :");
			String city = bufferedReader.readLine();
			
			//set the values to the query
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, city);
			preparedStatement.executeUpdate();
			System.out.println("Insertion Done!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
