package com.java.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDemo {
	public static void main(String[] args) {
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// creating a connection
			String url = "jdbc:mysql://localhost:3306/learn";
			String username = "root";
			String password = "root";
			Connection connection = DriverManager.getConnection(url, username, password);

			if (connection.isClosed()) {
				System.out.println("Connection closed!");
			} else {
				System.out.println("Connection made!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
