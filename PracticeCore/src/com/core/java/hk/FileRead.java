package com.core.java.hk;

//import java.io.BufferedReader;
import java.io.FileReader;

public class FileRead {
	public static void main(String[] args) {
		try {
			FileReader readfile = new FileReader("C:\\Users\\admin\\Documents\\Operator.txt");
//			BufferedReader bufferedReader = new BufferedReader(readfile);
			try {
				int i;
				while ((i=readfile.read())!=-1) {
					System.out.print((char)i);
				}
			} finally {
				readfile.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}