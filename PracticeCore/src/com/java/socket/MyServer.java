package com.java.socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(8050);
		Socket socket = serverSocket.accept();
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
		DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String str1 = "", str2 = "";
		while (!str1.equals("stop")) {
			str1 = dataInputStream.readUTF();
			System.out.println("client says:"+str1);
			str2=bufferedReader.readLine();
			dataOutputStream.writeUTF(str2);
			
		}

		dataInputStream.close();
		dataOutputStream.flush();
		dataOutputStream.close();
		
		serverSocket.close();
		socket.close();
		bufferedReader.close();
		
	}

}
