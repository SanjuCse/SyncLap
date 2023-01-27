package com.java.Jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateJBDC {
	public static void main(String[] args) {
		try {
			Connection connection = ConnectionProvider.getConnection();
			String query = "update demotable set tName=?, tCity=? where tId=?";

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter new Name  :");
			String name = bufferedReader.readLine();

			System.out.println("Enter new City  :");
			String city = bufferedReader.readLine();

			System.out.println("Enter the Student ID  :");
			int id = Integer.parseInt(bufferedReader.readLine());
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, city);
			
			preparedStatement.setInt(3, id);
			
			preparedStatement.executeUpdate();
			
			System.out.println("DONE!");
			connection.close();
		} catch (Exception e) {

		}
	}
}
