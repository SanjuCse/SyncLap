package com.java.io;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIO {

	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\j\\dataIO.txt");
		DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
		dataOutputStream.writeUTF("Sanjaya this side! have fun with java");

		FileInputStream fileInputStream = new FileInputStream("D:\\j\\dataIO.txt");
		DataInputStream dataInputStream = new DataInputStream(fileInputStream);
		String s = dataInputStream.readUTF();
		System.out.println(s);
//		FileInputStream fileInputStream = new FileInputStream("D:\\j\\dataIO.txt");
//		DataInputStream dataInputStream = new DataInputStream(fileInputStream);
//
//		while (true) {
//			String s = dataInputStream.readUTF();
//			if (s != null)
//				System.out.println(s);
//		}

	}

}
