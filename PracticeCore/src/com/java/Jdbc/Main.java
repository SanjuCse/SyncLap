package com.java.Jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		try {
			// get the connection
			Connection connection = ConnectionProvider.getConnection();

			// write the query
			String query = "insert into images(pic) values(?)";

			//
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			JFileChooser chooser = new JFileChooser();
			
			chooser.showOpenDialog(null);
			
			File file = chooser.getSelectedFile();
			FileInputStream fileInputStream = new FileInputStream(file);
			preparedStatement.setBinaryStream(1, fileInputStream, fileInputStream.available());
			preparedStatement.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "DONE!");
		} catch (Exception e) {

		}

	}

}
