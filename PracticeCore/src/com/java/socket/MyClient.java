package com.java.socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyClient {

	public static void main(String[] args) throws IOException{
		Socket socket = new Socket("localhost", 8050);
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
		DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String str1="",str2="";
		while (!str1.equals("stop")) {
			str1 = bufferedReader.readLine();
			dataOutputStream.writeUTF(str1);
			dataOutputStream.flush();
			str2 = dataInputStream.readUTF();
			System.out.println("server says:"+str2);
		}
		dataOutputStream.close();
		socket.close();
	}

}
