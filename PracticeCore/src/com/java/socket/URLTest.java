package com.java.socket;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.google.com");
		URLConnection connection = url.openConnection();
//		InputStream inputStream = connection.getInputStream();
//		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\sanju\\Desktop\\google.html");
//		while (true) {
//			int i = inputStream.read();
//			if (i == -1)
//				break;
////			System.out.print((char) i);
////			fileOutputStream.write((char) i);
//
//		}
		System.out.println(connection.getAllowUserInteraction());
		System.out.println(connection.getConnectTimeout());
		System.out.println(connection.getContent());
		System.out.println(connection.getContentEncoding());
		System.out.println(connection.getDate());
		System.out.println("write done!");
	}
}
