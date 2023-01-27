package com.java.Jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ImageSave {
	public static void main(String[] args) {
		try {
			// Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// Get the Connection
			String url= "jdbc:mysql://localhost:3306/jdbc";
			String userID="root";
			String pass="root";
			
			Connection connection = DriverManager.getConnection(url,userID,pass);
			
			// Write the Query
			String query = "insert into images(pic) values(?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\sanju\\Pictures\\IMG_20211117_121113_370 - Copy.jpg");
			preparedStatement.setBinaryStream(1, fileInputStream,fileInputStream.available());
			preparedStatement.executeUpdate();
			System.out.println("Done!");
			
			//close the connection
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
