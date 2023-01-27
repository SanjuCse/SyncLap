package com.java.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MyClient2 {
	Socket socket;
	DataInputStream dataInputStream;
	DataOutputStream dataOutputStream;

	public MyClient2() throws IOException {
		socket = new Socket("localhost", 10);
		dataInputStream = new DataInputStream(socket.getInputStream());
		dataOutputStream = new DataOutputStream(socket.getOutputStream());
		clientChat();
	}

	public void clientChat() throws IOException {

	}
}

class MyThr implements Runnable {
	DataInputStream dataInputStream;

	MyThr(DataInputStream dataInputStream) {
		this.dataInputStream = dataInputStream;
	}

	@Override
	public void run() {
		String s2 = " ";
		do {
			try {
				s2 = dataInputStream.readUTF();
				System.out.println(s2);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (!s2.equals("stop"));
	}

}