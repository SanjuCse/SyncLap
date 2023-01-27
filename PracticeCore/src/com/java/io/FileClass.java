package com.java.io;

import java.io.File;

public class FileClass {

	public static void main(String[] args) {
		File file = new File("D:\\");
		
		for (String string : file.list()) {
			System.out.println(string);
		}
		

	}

}
