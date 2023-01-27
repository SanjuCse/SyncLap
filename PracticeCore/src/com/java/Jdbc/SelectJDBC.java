package com.java.Jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectJDBC {
	public static void main(String[] args) {
		try {
			Connection connection = ConnectionProvider.getConnection();
			String query = "select * from demotable";

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String city = resultSet.getString(3);
				System.out.println(id + " : " + name + " : " + city);

			}
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
